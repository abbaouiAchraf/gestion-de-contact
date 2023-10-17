package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContactDTO;

import java.io.IOException;

/**
 * Servlet implementation class AddContact
 */
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("add controller get");
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouter_contacts.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("add controller post");
		ContactDTO contactDTO = new ContactDTO();
		System.out.println(request.getParameter("nom")+" "+ request.getParameter("prenom")+" "+ request.getParameter("numero_tele")+" "+request.getParameter("email"));
		contactDTO.addContact(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("numero_tele"),request.getParameter("email"));
		System.out.println("added in controller");
		response.sendRedirect("GestionContact");
	
	}

}