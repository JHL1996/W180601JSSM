<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="commons/basePath.jsp"%>
</head>
<body>
        <div>
            会员管理系统
        </div>

        <div>
            姓名: <input type="text" id="mName" width="100px">
           会员卡号: <input type="text" id="mCardNo" width="120px">
            <button  id="find">查询</button>
            <button  id="add">新增</button>
        </div>

        <div>
            <table border="1">
                <th>序号</th>
                <th>姓名</th>
                <th>联系电话</th>
                <th>会员级别</th>
                <th>会员卡号</th>
                <th>入会时间</th>
                <th>操作</th>
                <tbody id="xianshi">
              
                </tbody>
            </table>

        </div>

    <script>
        $(function () {
            $.ajax({
                url:"members/findAll",
                type:"GET",
                dataType:"JSON",
                success:function (data) {
                    $.each(data, function() {
                        alert(this.mName)
                        alert(this.mInTime)
                        var $op=("<tr><td>"+this.mId+"</td>" +
                            "<td>"+this.mName+"</td>" +
                            "<td>"+this.mPhone+"</td>" +
                            "<td>"+this.mLevel+"</td>" +
                            "<td>"+this.mCardNo+"</td>" +
                            "<td>"+this.mInTime+"</td></tr>")
                        $("#xianshi").append($op)
                    })

                }
            })
            $("#find").click(function () {
                var mName=$("#mName").val()
                var mCardNo=$("#mCardNo").val()

                $("#xianshi").empty()
                $.ajax({
                    url:"members/find",
                    data:{mName:mName,mCardNo: mCardNo},
                    type:"GET",
                    dataType:"json",
                    success:function (data) {
                        alert(mName)

                        var $op=("<tr><td>"+data.mId+"</td>" +
                            "<td>"+data.mName+"</td>" +
                            "<td>"+data.mPhone+"</td>" +
                            "<td>"+data.mLevel+"</td>" +
                            "<td>"+data.mCardNo+"</td>" +
                            "<td>"+data.mInTime+"</td></tr>")
                        $("#xianshi").append($op)
                    }
                })
            })
        })
        
    </script>
</body>
</html>
