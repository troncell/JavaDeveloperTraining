<%--
  Created by IntelliJ IDEA.
  User: 钱程
  Date: 2023/5/31
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>商品信息</title>
</head>
<body>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
    // $.ajax({
    //     type: "post",     //发送请求的方式    get / post
    //     dataType: "json",		// 从服务端返回数据的格式：html, xml, text,json
    //     url: "./getInfo",		//请求的路径，根据自己的servlet而不同
    //     // data: check_file,		//请求带的参数，这里的check_file是一个js对象,对象的三个属性就是需要传的参数
    //     success: function (msg) {
    //         // var list=msg;
    //         // console.log("拿到数据成功");
    //         // console.log(msg)//发送请求成功时执行的函数，其中的msg参数是后台的返回的数据。
    //         $("#a").text(msg);
    //     }
    // });
    var token = sessionStorage.getItem("token");
    console.log(token);


    function buy(id){
        $.ajax({
            type: "get",     //发送请求的方式    get / post
            dataType: "json",		// 从服务端返回数据的格式：html, xml, text,json
            url: "./api/buy?id="+id,		//请求的路径，根据自己的servlet而不同
            headers:{token:token},
            success: function (msg) {
                // var list=msg;
                location.reload();
                console.log("购买成功");
                // console.log(msg)//发送请求成功时执行的函数，其中的msg参数是后台的返回的数据。
            }
        });
    }
</script>

<table border="1" align="center" cellspacing="0" >
    <tr>
        <th>商品名</th>
        <th>商品编码</th>
        <th>商品种类</th>
        <th>商品品牌</th>
        <th>商品库存</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.productName}</td>
            <td>${product.productNo}</td>
            <td>${product.productCategory}</td>
            <td>${product.brand}</td>
            <td>${product.productWare}</td>
            <td><input type="button" onclick="buy(${product.id})" value="购买"> </td>
        </tr>
    </c:forEach>

</table>


</body>
</html>
