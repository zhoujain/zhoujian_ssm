

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/user/register.do" method="post">
    用户名:<input type="text" name="username"><br/>
    邮箱:<input type="text" name="email"><br/>
    密码:<input type="password" name="password"><br/>
    电话:<input type="text" name="phoneNum"><br/>

    <input type="submit" value="注册">
</form>
</body>
</html>
