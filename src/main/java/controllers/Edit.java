package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContactDTO;

import java.io.IOException;

/**
 * Servlet implementation class Edit
 */
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// response.getWriter().append("Served at: ").append(request.getContextPath())
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifier_contacts.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		int id = Integer.parseInt(request.getParameter("id"));
		ContactDTO contactDTO = new ContactDTO();
		contactDTO.editContact(id, request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("numero_tel"),request.getParameter("email"));
		this.getServletContext().getRequestDispatcher("/WEB-INF/contacts.jsp").forward(request, response);
	}

}
