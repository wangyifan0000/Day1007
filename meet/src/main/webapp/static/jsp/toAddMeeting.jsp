<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doupdateSelectById" method="post">
    <table border="1px">
        <tr>
            <td>会议室预定</td>
        </tr>
        <tr>
            <td>会议室<select name="meetingname">
                <option value="一号会议室">一号会议室</option>
                <option value="二号会议室">二号会议室</option>
                <option value="三号会议室">三号会议室</option>
            </select></td>
        </tr>
        <tr>
            <td>申请人<input type="text" name="advancename" ></td>
        </tr>
        <tr>
            <td>预定日期<input type="text" name="date" ></td>
        </tr>
    </table>
</form>
<script>
    $("form").submit(function () {
        var meetingname = $("[name='meetingname']").val();
        var date = $("[name='date']").val();
        var advancename = $("[name='advancename']").val();
        if (meetingname == "") {
            alert("填写预订会议室");
            return false;
        }
        if (advancename == "") {
            alert("填写预订人");
            return false;
        }
        if (date == "") {
            alert("请填写预定日期");
            return false;
        }
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        if (!date.match(reg)) {
            alert("时间格式不正确!!!");
            return false;
        }
    })
</script>
</body>
</html>
