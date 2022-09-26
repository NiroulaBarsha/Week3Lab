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
public class ArithmeticCalculatorServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message="-----";
         request.setAttribute("message",message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request,response);
        /*String ageStr = request.getParameter("age");
         int age;
        if (ageStr == null) {
            //The "age" input is missing.
              
        } else{
             age = Integer.parseInt(ageStr);
             age = age + 1;
             
             request.setAttribute("age", age);
                    
        }*/
        
       // this.getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*int age;
        String messageToDisplay = "";
        */
        String firstStr = request.getParameter("first");
         String secondStr = request.getParameter("second");
         String operation= request.getParameter("operation");
         String message;
          
        try{ 
         double first = Double.parseDouble(firstStr);
         double second = Double.parseDouble(secondStr);
         
        double result;
         
         
        
         
        switch (operation){
            case "+":{
                result=first+second;
                break;
            }
            case "-":{
                result=first-second;
                break;
            }
            case "*":{
                result=first*second;
                break;
            }
            case "%":{
                result=first/second;
                break;
            }
            default:{
                result=Double.NaN;
                break;
            }
        }
        if(Double.isNaN(result)){
                message="Result is not a number";
            }else{
               message= String.format("%.4f",result);
                        //message= result +"";
            }
        }catch(Exception ex){
                message="invalid";
                }
        
            
        //request.setAttribute("result",result);
        request.setAttribute("message",message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);


    }
   

}

