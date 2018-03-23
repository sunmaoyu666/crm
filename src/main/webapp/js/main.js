/**
 * 修改密码的对话框
 */
function openPasswordModifyDialog() {

    $('#dlg').dialog('open');
}

/**
 *
 * 提交修改密码
 *
 *  执行提交操作，该选项的参数是一个对象，它包含以下属性：
 url：请求的URL地址。
 onSubmit: 提交之前的回调函数。
 success: 提交成功后的回调函数。
 */
function modifyPassword() {
    $('#fm').form('submit', {
            url: ctx + "/user/modifyPassword",
        onSubmit: function(){
        var isValid = $(this).form('validate');//表单校验结果 作表单字段验证，当所有字段都有效的时候返回true
        if (!isValid){//校验失败
            $.messager.alert('警告',"修改操作校验失败");	// 如果表单是无效的则隐藏进度条
        }
        return isValid;	// 返回false终止表单提交
    },
    //提交成功过后
    success: function(data){
        data = JSON.parse(data);
        if(data.code == 200){
            $.messager.alert("来自crm","密码修改成功,系统将在两秒后自动退出！！！","info");
            //定时任务
            setTimeout(function () {
                window.location.href = "/main/index";
            },2000)
        }else {
            $.messager.alert("来自crm",data.msg,"info");
        }
    }
});
}

//关闭窗口
function closePasswordModifyDialog() {
    $('#dlg').dialog('close');
}

/**
     添加一个新选项卡面板，选项参数是一个配置对象，查看选项卡面板属性的更多细节。在添加一个新选项卡面板的时候它将变成可选的。
     添加一个非选中状态的选项卡面板时，记得设置'selected'属性为false。
     // 添加一个未选中状态的选项卡面板
     $('#tt').tabs('add',{
        title: '新选项卡面板',
        selected: false
        //...
    });
 */

function openTab(text,url,iconCls) {
    if ($("#tabs").tabs("exists",text)){
        $("#tabs").tabs("select",text);
    }else{
        var content="<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='" +ctx+"/"+ url + "'></iframe>";
        $('#tabs').tabs('add',{
            title: text,
            iconCls: iconCls,
            closable:true,
            content:content
        });
    }
}