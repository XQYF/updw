<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/IconExtension.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">

    $(function(){
        //上传文件框
        $("#upload").filebox({
            buttonText: '选择文件',
            buttonAlign: 'right'
        });
        //保存按钮
        $("#saveButton").linkbutton({
            "iconCls":"icon-table_save",
            onClick:function(){
                $("#upForm").form("submit",{
                    "url":"${pageContext.request.contextPath}/updw1/upload",
                    onSubmit:function(){
                        var valid=$(this).form("validate");
                        console.log(valid);
                        if(valid){
                            return valid;
                        }
                        return valid;
                    },
                    success : function(){
                        $.messager.show({
                            "title":"保存成功",
                            "msg":"新数据已入库"
                        });
                    }
                });
            }
        });
    })
    </script>
</head>
<body>
<form method="post" id="upForm" align="center" enctype="multipart/form-data">
        <input id="upload" type="text" name="file">
        <div><a id="saveButton">保存</a></div>
</form>
</body>
</html>