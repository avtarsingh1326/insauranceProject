package com.web.files;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 * Servlet implementation class UploadFileServlet
 */
@WebServlet("/UploadFileServlet")
@MultipartConfig
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 try {
			 	System.out.println("Name: " + request.getParameter("name"));
	            // Get all parts from the request
	            Collection<Part> parts = request.getParts();

	            for (Part part : parts) {
	                // If the part is a file, process it
	                if (!part.getSubmittedFileName().isEmpty()) {
	                    // Get the file name
	                    String fileName = new File(part.getSubmittedFileName()).getName();

	                    // Specify the directory where the file will be stored
	                    String uploadFolder = "/Users/avtarbadwal/eclipse-workspace/WebProjectTest"
	                    		+ "/src/main/webapp/uploadedFiles";
	                    String filePath = uploadFolder + File.separator + fileName;
	                    File storeFile = new File(filePath);
	                    System.out.println("File name and path : " + filePath);
	                    // Save the file to the specified directory
	                    part.write(storeFile.toString());
	                    
	                   
	                }
	            }
	        } catch (Exception e) {
	            request.setAttribute("message", "File Upload Failed due to " + e);
	        }

	        request.getRequestDispatcher("/file-upload.jsp").forward(request, response);
		
	}

}
