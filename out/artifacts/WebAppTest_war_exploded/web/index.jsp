<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2020-08-19
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <meta charset="UTF-8">
  </head>
  <body>
  <form action = "SE" method="get">
    <input type ="text" name="name" placeholder="get방식"><br><br>
    <input type ="password" name="age"><br><br>
    <input type ="submit" value="get방식"><br><br>
  </form>
  <form action="SE" method="post">
    <input type ="text" name="name" placeholder="post방식"><br><br>
    <input type ="password" name="age"><br><br>
    <input type="submit" value="post방식">
  </form>
  </body>
</html>
