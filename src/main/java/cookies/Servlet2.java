package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");

		Cookie cookies[] = req.getCookies();
		String cookieName = "";
		String cookieValue = "";

		for (Cookie cookie : cookies) {

			System.out.println(cookie.getName() + " is the unique key");
			System.out.println(cookie.getValue() + " is the original value");

		cookieName = cookie.getName();
			cookieValue = cookie.getValue();
		}

		PrintWriter printWriter = resp.getWriter();

		printWriter.write("<html><body><h2>Welcome To My New Application " + cookieValue + " </h2></body></html>");

	}

}
