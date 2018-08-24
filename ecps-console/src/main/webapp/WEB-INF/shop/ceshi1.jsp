<%--
  Created by IntelliJ IDEA.
  User: zhangxinfei
  Date: 2018/7/31
  Time: 08:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="res/js/jquery-2.1.0.js"></script>
    <script>
        function customclose(){
            var txt={"userId":1,"username":"张新飞","password":"000","userIphone":11,"userQq":null,"userSex":"MAN","userBirthday":901182572000,"userAdress":null,"userSchool":null,"userStudentid":null,"userClassid":null,"userCredit":null};

            var jsonString = JSON.stringify(txt);
            $.ajax({
                type: "post",
                url: "http://localhost:8080/User/updateByPrimaryKey",
                data : jsonString,
                dataType: 'json',
                success: function(data,textStatus){
                    alert("操作成功");
                },
                error: function(xhr,status,errMsg){
                    alert("操作失败!"+errMsg);
                }
            });
        }
    </script>
</head>
<body>
<button onclick="customclose()">提交</button>
<p id="show"></p>
</body>
</html>
