<%-- 
    Document   : newjsp
    Created on : 27 трав. 2021 р., 18:57:43
    Author     : Ольга
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab7.Tree"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 6-7</title>
    </head>
    <body>
        <h1>lab 6-7 </h1>
        <h1>Variant 23</h1>
        <h3> Лабораторна робота 6: Регресія </h3>
        <p>Випадковий масив:  <%= request.getAttribute("reg_arr")%></p>
        <p> Кількість елементів, які менші заданого числа : <%= request.getAttribute("reg_tail")%></p>
        <p> Регресія: <%= request.getAttribute("reg_regression")%></p>
        <p> Ітерація: <%= request.getAttribute("reg_iter")%></p>
        <h3> Лабораторна робота 7: Бінарне дерево</h3>

        <%
            List<Integer> arr = Arrays.asList(11, 6, 1, 7, 10, 9, 8, 4);
            Collections.sort(arr);
            Tree tree = new Tree(arr);
        %>
        <h2> Tree Array: (11, 6, 1, 7, 10, 9, 8, 4) </h2>
        <p> Recursion Tree:-- <%= tree.getPostOrder()%></p>
        <p> Iterative Tree:-- <%= tree.getPostOrderIterative()%></p>

        <form action="../index.jsp" align="center">
            <input type="submit" value="Home">
        </form>
    </body>
</html>
