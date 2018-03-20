package com.shsxt.crm.core.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 *  字符串 工具类
 * @author Mr.YongGan.Zhang
 * @version 1.0.0
 *
 */
public final class StringUtil {

    private StringUtil(){}

    /*
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /*
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

}