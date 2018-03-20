package com.shsxt.crm.core.framework.exception.handler;

import com.shsxt.crm.core.common.util.JsonUtil;
import com.shsxt.crm.core.common.util.Result;
import com.shsxt.crm.core.framework.constant.ExceptionConstant;
import com.shsxt.crm.core.framework.constant.HttpRequestConstant;
import com.shsxt.crm.core.framework.exception.GlobalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 全局异常处理器
 *
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver {

    private static final Logger LOGGER  =  LoggerFactory.getLogger(GlobalExceptionHandler. class );

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv  = new ModelAndView();

        if (handler instanceof HandlerMethod) {
            // 获取拦截到的方法
            HandlerMethod hm  =   (HandlerMethod) handler;

            GlobalException e =  null;
            if (ex instanceof GlobalException) {// 判定是否是自定义异常
                e =  (GlobalException)ex;
            }else  {
                //记录异常信息
                if (LOGGER.isErrorEnabled())
                    LOGGER.error("未知异常 ： 异常的原因 ：{}", ex.getMessage());

                e = new GlobalException();
                e.setCode(ExceptionConstant.DEFAULT_EX_CODE);
                e.setMsg(ExceptionConstant.DEFAULT_EX_MSG_NET);
            }
            // 将异常信息装换 结果集
            Result result = new Result();
            result.setCode(e.getCode());
            result.setMsg(e.getMsg());

            // 判断是否是 json返回
            // ajax  @responsebody
            boolean flag =  HttpRequestConstant.AJAX_XMLHTTPREQUEST
                    .equals(request.getHeader(HttpRequestConstant.HTTP_REQUESTED_WITH));

            Method method = hm.getMethod();
            ResponseBody an = method.getAnnotation(ResponseBody.class);

            if (flag || an != null) {//说明 异常信息 json 返回
                String json = JsonUtil.parseObjectToString(result);
                JsonUtil.write(response,json);
            }else {
                mv.setViewName("error");
                mv.addObject("error",result.getMsg());
            }
        }
        return mv;
    }
}
