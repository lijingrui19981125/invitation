<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/12
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <h1>回复信息列表</h1>
    <form action="" method="post" id="">
        <input type="submit" value="添加回复">
        <input type="button" value="返回帖子列表" onclick="toMain()">
    </form>
    <table border="1" cellspacing="0" cellpadding="5" width="80%">
        <tr>
            <th>回复内容</th>
            <th>回复昵称</th>
            <th>发布时间</th>
        </tr>
        <%--动态--%>
        <c:forEach items="${replyDetailList}" var="replyDetail">
            <tr>
                <td>${replyDetail.content}</td>
                <td>${replyDetail.author}</td>
                <td><fmt:formatDate value="${replyDetail.createdate}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
<script>
    function toMain() {
        location.href = "${pageContext.request.contextPath}/invitation/list";
    }
</script>
</html>
