package com.wolff.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wolff.dao.LoginDao;
import com.wolff.model.Site;
import com.wolff.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		User u = new User(username,password);
		LoginDao d = new LoginDao();
		
		
		List<Site>listSites = d.listAllChannels();
		HttpSession sesh = request.getSession();
		sesh.setAttribute("list", listSites);
		
		
		
		String path = "";
		List<User>listar = d.login(u);
		if(listar != null){
			HttpSession sesh2 = request.getSession();
			sesh2.setAttribute("listar", listar);
			path = "welcome.jsp";
		}else {
			path = "index.jsp";
		}
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher(path);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
