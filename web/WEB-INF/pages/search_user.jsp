<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/24/2017
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${l_user}" var="one_user" varStatus="s" begin="0" end="${l_user.size()}">
    <tr>
        <td>
            <div class="tt">
                <p><a href=/userpage/${one_user.getUser_id()}>${one_user.getUsername()}</a></p>
            </div>
        </td>
        <td>
            <p>${one_user.getIntroduction()}</p>
        </td>

    </tr>
</c:forEach>
</body>
</html>
