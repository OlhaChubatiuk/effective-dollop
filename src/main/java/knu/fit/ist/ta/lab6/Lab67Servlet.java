/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ольга
 */
@WebServlet("/lab6-7")
public class Lab67Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer x = Integer.parseInt(request.getParameter("x"));
        Integer n = Integer.parseInt(request.getParameter("n"));

        Regression regr = new Regression(n);
        int regTail = regr.lessThanXTail(x);
        int regLessX = regr.lessThanX(x);
        int iterLess = regr.iterativeLessThanX(x);
        String arr = regr.getArrayString();

        request.setAttribute("reg_tail", regTail);
        request.setAttribute("reg_regression", regLessX);
        request.setAttribute("reg_iter", iterLess );
        request.setAttribute("reg_arr", arr);

        request.getRequestDispatcher("lab6-7.jsp").forward(request, response);
    }
}
