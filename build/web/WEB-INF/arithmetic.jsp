<%-- 
    Document   : arithmetic.jsp
    Created on : 25-Sep-2022, 9:51:43 AM
    Author     : Barsha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>

        <form action="arithmetic" method="POST"> 
            <p><label>First:</label>
                <input type="number" name="first" id="second" value="" />
            </p><p><label>Second:</label>
                <input type="number" name="second" id="second" value="" />
            </p>
            <button type="submit" name="operation" value="+">+</button>
            <button type="submit" name="operation" value="-">-</button>
            <button type="submit" name="operation" value="*">*</button>
            <button type="submit" name="operation" value="%">%</button>
            <P>Result:<%= request.getAttribute("message")%>
            </p>           
        </form>
            <a href="./age">Age Calculator</a>
    </body>
</html>
