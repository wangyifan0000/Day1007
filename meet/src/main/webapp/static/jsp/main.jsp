<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table border="1px">
        <tr>
            <td>预定编号</td>
            <td>会议室</td>
            <td>预定人</td>
            <td>日期</td>
        </tr>
        <c:forEach var="meeting" items="${list}">
            <tr>
                <td>${meeting.id}</td>
                <td>${meeting.meetingName}</td>
                <td>${meeting.advanceName}</td>
                <td><fmt:formatDate value="${meeting.meetingOrder}" pattern="yyyy-MM-dd"></fmt:formatDate>></td>
            </tr>
        </c:forEach>
        <tr><a href="/toAddMeeting">预定会议室</a></tr>
    </table>
</form>
<script>
    $(function () {
        $("tr:odd").css("background-color", "gray");
    })
</script>
</body>
</html>
