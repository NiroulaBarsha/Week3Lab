/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Barsha
 */
public class AgeCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        /*String ageStr = request.getParameter("age");
         int age;
        if (ageStr == null) {
            //The "age" input is missing.
              
        } else{
             age = Integer.parseInt(ageStr);
             age = age + 1;
             
             request.setAttribute("age", age);
                    
        }*/
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*int age;
        String messageToDisplay = "";
        */
        String ageStr = request.getParameter("age");
        String message =null;
         int age;
        if (ageStr == null) {
            //The "age" input is missing.
            message= "You Must Enter a value";
              
        } else{
            try{
                 age = Integer.parseInt(ageStr);
             age = age + 1;
          
             
             request.setAttribute("age", age);
            
            }catch (Exception ex){
                message="Invalid Value, Use Number";
            }
             
                    
        }
        //request.setAttribute('message',message);
        

        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);


    }
   

}
