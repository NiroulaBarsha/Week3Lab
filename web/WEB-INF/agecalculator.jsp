<%-- 
    Document   : agecalculator
    Created on : 19-Sep-2022, 9:05:51 AM
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
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST"> 
            <label>Enter your age:</label>
            <input type="number" name="age" id="age" value="" />
            <br>
            <button type="submit"><strong>Age Next Birthday</strong></button>
        </form>
        <% if(request.getAttribute("age")!=null){ %>
        <p> Your age next after next birthday:
           <%= request.getAttribute("age") %></p>
          <%}%>
           
           <% if(request.getAttribute("message")!=null){ %>
           <p><%= request.getAttribute("message") %></p>
          <%}%>
          <a href="./arithmetic">Arithmetic Calculator</a>
          
    </body>
</html>
