/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import knu.fit.ist.ta.lab4.TaskForLab4;

/**
 *
 * @author Ольга
 */
@WebServlet("/Lab5")
public class Servlet_Lab5 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Lab5</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_Lab5 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        TaskForLab4 tfl4 = new TaskForLab4();
        LinearSearch LS = new LinearSearch();

        List<String> text = tfl4.getList(tfl4.text);
        String t1find = request.getParameter("t1find");
        int t1start;
        int t1finish;
     
        String t1 = "";
         
        String t3string = request.getParameter("t3string");
        int t3int = Integer.parseInt(request.getParameter("t3int"));

        if (request.getParameter("t1start") == "") {
            t1start = -1;
        } else if (Integer.parseInt(request.getParameter("t1start")) < 0) {
            t1 = "Enter search positions that are greater than or equal to 0";
            t1start = Integer.parseInt(request.getParameter("t1start"));
        } else {

            t1start = Integer.parseInt(request.getParameter("t1start"));
        }
        if (request.getParameter("t1finish") == "") {
            t1finish = -1;
        } else if (Integer.parseInt(request.getParameter("t1finish")) < 0) {
            t1 = "Enter search positions that are greater than or equal to 0";
            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        } else {

            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        }

        sortApproach2_binarySearch sA2_bS = new sortApproach2_binarySearch(Integer.parseInt(request.getParameter("t2")));
        if (t1 == "") 
         t1 = LS.Task1(t1find, t1start, t1finish, text);
        
       
        String t2s = "" + sA2_bS.getUnsortedStringList();
        String t2i = "" + sA2_bS.getUnsortedIntList();
        String sortedt2s = "" + sA2_bS.sortApproach2String();
        String sortedt2i = "" + sA2_bS.sortApproach2Int();
        String findt3s = sA2_bS.binarySearch_String(t3string, sA2_bS.sortApproach2String());
        String findt3i = sA2_bS.binarySearch_Int(t3int, sA2_bS.sortApproach2Int());

        request.setAttribute("t1", t1);
        request.setAttribute("t2s", t2s);
        request.setAttribute("t2i", t2i);
        request.setAttribute("sortedt2s", sortedt2s);
        request.setAttribute("sortedt2i", sortedt2i);
        request.setAttribute("findt3s", findt3s);
        request.setAttribute("findt3i", findt3i);

        request.setAttribute("t1find", t1find);
        request.setAttribute("t3string", t3string);
        request.setAttribute("t3int", t3int);
        
        request.getRequestDispatcher("Lab5.jsp").forward(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
