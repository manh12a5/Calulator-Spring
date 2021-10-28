<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/2/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator:</h1>
<form method="post">
    <div>
        <input type="text" name="left"/>
        <input type="text" name="right"/>
    </div>
    <div>
        <p>
            <input type="submit" class="button" name="operator" value="+"/>
            <input type="submit" class="button" name="operator" value="-"/>
            <input type="submit" class="button" name="operator" value="*"/>
            <input type="submit" class="button" name="operator" value="/"/>
        </p>
    </div>
    <div>
        <input style="width: 100px" type="submit" class="button" name="operator" value="C"/>
    </div>
    <div>
        <h1>Result: ${result}</h1>
    </div>
</form>
</body>
</html>
