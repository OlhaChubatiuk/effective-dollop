<%-- 
    Document   : Lab3
    Created on : 18 квіт. 2021 р., 14:44:16
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
        <h1>Task of lab 3(task 11)</h1>
        <P>Заповнити масив різних k натуральних чисел більших 10. Визначити масив чисел, елементи якого утворюються сумою квадратів цифр елементів вихідного масиву. </P>




        <P>  Initial array: <%=request.getAttribute("resultArray")%></P>
        <P> The result of modified array: <%=request.getAttribute("result")%></P>



        <div><form action="Lab3form.jsp">
                <input type="submit" value="New length">
            </form> 
        </div>


        <div><form action="index.jsp">
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
