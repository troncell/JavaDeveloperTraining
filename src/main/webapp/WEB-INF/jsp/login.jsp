<%--
  Created by IntelliJ IDEA.
  User: 钱程
  Date: 2023/5/30
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
        #a {

            width:50%;
            height:200px;
            border: 1px dashed ;
            background-color:lightyellow;
            text-align:center;
        }
        body{
            background-color:lightblue;
        }
    </style>
</head>
<body>
<div id="a">
    <h1>登录界面</h1>
    <form action="/loginJsp" method="post">
        账号:<input type="text" name="username"/>
        <br>
        密码:<input type="password"name="pwd"/>
        <br>

        <input type="submit" value="登录"/>


    </form>
    <form action="/redirect/regist" method="post">
        <input type="submit" value="注册"/>
    </form>



</div>
</body>
</html>
