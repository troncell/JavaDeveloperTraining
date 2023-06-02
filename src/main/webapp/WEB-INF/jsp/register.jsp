<%--
  Created by IntelliJ IDEA.
  User: 钱程
  Date: 2023/5/30
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>账号注册</title>
</head>
<style>
    #a {
        width:50%;
        height:50%;
        border: 1px dashed ;
        background-color:lightgreen;
        text-align:center;
    }

    body{
        background-color:lightyellow;
    }
</style>
<body>
<%--注册框 --%>
<div id="a">
    <h1>注册账号</h1>
    <form action="/regist"  method="post">
        用&nbsp;户&nbsp;名:
        <input type="text"
               name="username">
        <br>

        密&nbsp;&nbsp;&nbsp;码:
        <input type="password"name="pwd">
        <br>

        姓名:
        <input type="text" name="name">
        <br>


        <input type="submit" value="注册">

        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
