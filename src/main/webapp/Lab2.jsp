<%-- 
    Document   : Lab2
    Created on : 18 квіт. 2021 р., 13:33:03
    Author     : Ольга
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Task of lab 2(23 variant)</h1>
        <P>(√dx)/(a*x^2 + b*x +c)</P>
        <P>a = 6; b = 5; c = -8; d = 10</P>
        
        <p><%=request.getAttribute("result")%></p>
        
                        <div><form action="Lab2form.jsp">
                <input type="submit" value="New x">
            </form> 
        </div>
        
        
        
                        <div><form action="index.jsp">
                <input type="submit" value="Home">
            </form> 
        </div>
        
    </body>
</html>