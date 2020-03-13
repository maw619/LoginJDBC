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

/**
 * Servlet implementation class AddSiteController
 */
@WebServlet("/AddSiteController")
public class AddSiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("/addsite.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao d = new LoginDao();
		String url = request.getParameter("url");
		String channel = request.getParameter("channel");
		String genre = request.getParameter("genre");
		//String[]error = {"invalid url","invalid channel","invalid genre"};
		String redirect = "";
		String result = null;
		
		
		HttpSession sesh = request.getSession();
	
		List<Site>listSites = d.listAllChannels();
		HttpSession sesh2 = request.getSession();
		sesh2.setAttribute("list", listSites);
		
		
		if(url.equalsIgnoreCase("")) {
			url = null;
		}if(channel.equalsIgnoreCase("")) {
			channel = null;
		}if(genre.equalsIgnoreCase("")) {
			genre = null;
		}else {
			redirect = "addsite.jsp";
			
		}
		Site s = new Site(url,channel,genre);
		if(d.addSite(s) != false) {
			String r2 = "would you like to add another?";
			sesh.setAttribute("result", r2);
			RequestDispatcher dis = request.getRequestDispatcher(redirect);
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("404.jsp");
			dis.forward(request, response);
		}
		
		
		
		
		
	}

}
