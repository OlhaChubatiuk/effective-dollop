/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ольга
 */
@WebServlet(name = "Lab3Servlet", urlPatterns = {"/Lab3"})
public class Lab3Servlet extends HttpServlet {

    /*  @Autowired
    Lab3View lab3view;*/

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    
         Lab3View lab3view = new Lab3View();
        
        String resultArray = lab3view.showStartArray(request.getParameter("arrayLeng"));
        
        request.setAttribute("resultArray", resultArray);
        
        String result = lab3view.showResult(request.getParameter("arrayLeng"));
        
        request.setAttribute("result", result);
        
        request.getRequestDispatcher("Lab3.jsp").forward(request, response);

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




    /*
        lab3Task1 lab3t1 = new lab3Task1();
        int arlng = Integer.parseInt(request.getParameter("arrayLeng"));
        int[] x = lab3t1.task(arlng);
        
        String output = lab3t1.output(x);
        int[] cfn = lab3t1.prod(x, arlng);
        
        request.setAttribute("output", output);
        request.setAttribute("cfn", cfn);
        request.getRequestDispatcher("Lab3.jsp").forward(request,response);*/
        ////////////////////////////////////////////////////////////////////