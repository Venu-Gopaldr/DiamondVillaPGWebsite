package diamondvilla.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diamondvilla.dao.Guestdao;
@WebServlet("/DVFI")
public class GetToFetch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try{
			String email = req.getParameter("email");
			Guestdao guestdao = new Guestdao();
			Object o = guestdao.fetch(email);
			req.setAttribute("individual", o);
			RequestDispatcher rd = req.getRequestDispatcher("individual.jsp");
			rd.forward(req, resp);
//			resp.getWriter().print(o);
		}catch (Exception e ){
			resp.getWriter().print("Data Not Found!!");
		}
		
	}
}
