<%--
  Created by IntelliJ IDEA.
  User: 钱程
  Date: 2023/5/31
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
    sessionStorage.setItem("token","${token}")
    var token = "${token}";
    // function shopping(){
    //     $.ajax({
    //         type: "post",     //发送请求的方式    get / post
    //         dataType: "json",		// 从服务端返回数据的格式：html, xml, text,json
    //         url: "./api/getInfo",		//请求的路径，根据自己的servlet而不同
    //         headers:{token:token}
    //     });
    // }
</script>
<body>
<form action="/getInfo" method="post">
    <input type="submit" value="进入购物"/>
</form>

</body>
</html>
