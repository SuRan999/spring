<%@ page language="java"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setAttribute("path", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


<body>
    <form action="${path}/upload/upload" method="post" enctype="multipart/form-data" >
        id:<input type="text"  name="pId" style="width:100px"><br/><p/>
        图片名称<input type="text"  name="pName" style="width:100px"><br/><p/>
        选择图片：<input  type="file" name="file" style="width:100px" id="clo" /><br/><p/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>


