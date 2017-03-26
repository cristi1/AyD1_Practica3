/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class registroControlador extends HttpServlet {

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
        String nombre = request.getParameter("txtName");
        String usuario = request.getParameter("txtUser");
        String correo = request.getParameter("txtEmail");
        String password = request.getParameter("txtPassword");
        
        if(nombre.equals("") || usuario.equals("") || correo.equals("") || password.equals("")){
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }else{
            UsuarioDAO user = new UsuarioDAO();
            if(user.existUsuario(usuario)){
                request.getRequestDispatcher("error3.jsp").forward(request, response);
            }else{
                boolean r = user.insertUsuario (nombre, usuario, correo, password);
                if(!r){
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }else{
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                }
            }
            //creando session
            /*Usuario nuevo = new Usuario(code,usuario,password);
            request.getSession().setAttribute("actual", nuevo);
            request.getRequestDispatcher("exito.jsp").forward(request, response);*/
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
        processRequest(request, response);
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
