<%-- 
    Document   : newjsp
    Created on : 3 черв. 2021 р., 21:55:30
    Author     : Ольга
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
           <h1>Laba 8</h1>

        <h2>Variant 23</h2>

        <h2>Find an element of an array using three algorithms: <b>linearSearch, binarySearch, jumpSearch</b></h2>
                <%! int[] arr= {0, 1,  2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3,  4, 5, 6, 7, 1, 2, 3, 4,  5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5,6, 7, 101,135,}; %>
                <%! Algorithms algorithms = new Algorithms();%>
                <%int number = (int)request.getAttribute("number"); %>
                <h3>Array: <%=Arrays.toString(arr)%></h3>
                <hr>


                <%
                long startTime = System.nanoTime();
                int i = algorithms.linearSearch(arr, number);
                long endTime = System.nanoTime();
                long SearchDuration = (endTime - startTime);   
                %>

                <h3><b>Algorithm:</b> linear search</h3>
                <h3><b>Number index::</b> <%=i%></h3>
                <h3><b>Lead time: </b> <%=SearchDuration%></h3>
                 <h3><b>Algorithm complexity:</b> O(N)</h3>
                
                <hr>

                <%
                startTime = System.nanoTime();
                i = algorithms.jumpSearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime);         
                %>

                <h3><b>Algorithm:</b> jump search</h3>
                <h3><b>Number index:</b> <%=i%></h3>
                <h3><b>Lead time: </b> <%=SearchDuration%></h3>
                 <h3><b>Algorithm complexity:</b> O(sqrt (N))</h3>
               
                <hr>

                <%
                startTime = System.nanoTime();
                i = algorithms.binarySearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime);         
                %>

                <h3><b>Algorithm:</b> binary search</h3>
                <h3><b>Number index:</b> <%=i%></h3>
                <h3><b>Lead time: </b> <%=SearchDuration%></h3>
                <h3><b>Algorithm complexity:</b> O(log (N))</h3>
               

        <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
        </form>
