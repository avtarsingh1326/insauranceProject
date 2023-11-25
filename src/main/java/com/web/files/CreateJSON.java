package com.web.files;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class CreateJSON
 */
@WebServlet("/CreateJSON")
public class CreateJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Gson gson = new Gson();    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("application/json");
		System.out.println("sadas");
		Student student = new Student();
		response.getWriter().print(this.gson.toJson(student));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

class Student {
	String name ="avtar";
	int id = 12;
}
