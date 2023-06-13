package httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
public class Session2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String name = req.getParameter("name");
//
//		Cookie cookies[] = req.getCookies();
//		String cookieName = "";
//		String cookieValue = "";
//
//		for (Cookie cookie : cookies) {
//
//			System.out.println(cookie.getName() + " is the unique key");
//			System.out.println(cookie.getValue() + " is the original value");
//
//		cookieName = cookie.getName();
//			cookieValue = cookie.getValue();
//		}
		
		HttpSession httpSession = req.getSession();
		String name= (String)httpSession.getAttribute("username");

		PrintWriter printWriter = resp.getWriter();

		printWriter.write("<html><body><h2>Welcome To My New Application " + name + " </h2></body></html>");
		
		printWriter.write("<h2> <a href='session3'> logout </a></h2>");

	}


}
