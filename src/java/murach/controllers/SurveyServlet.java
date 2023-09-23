/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.User;

public class SurveyServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birth = request.getParameter("birth");
        String heardFrom = request.getParameter("heardAbout");
        String wantsUpdates = request.getParameter("wantsUpdates");
        String contactVia = request.getParameter("contactVia");
        
        if (wantsUpdates == null) {
            wantsUpdates = "No";
            contactVia = "No have";
        }
        else {
            wantsUpdates = "Yes";
        }
        
        // store data in User object
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setBirth(birth);        
        user.setHeardFrom(heardFrom);        
        user.setWantsUpdates(wantsUpdates);
        user.setContactVia(contactVia);

        // store User object in request
        request.setAttribute("user", user);

        // forward request to JSP
        String url = "/thank.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {doPost(request, response);}
}
