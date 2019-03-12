<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/11
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="${path}/download/down?path=e6f445bc-2211-48b4-be12-8267e5396fd6483.jpg">下载</a>
</body>
</html>
