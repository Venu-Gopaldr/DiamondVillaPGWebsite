package diamondvilla.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diamondvilla.dao.Guestdao;
import diamondvilla.dto.GuestDB;

@WebServlet("/did")
public class Deletebyid extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	Guestdao guestdao = new Guestdao();
	String msg = guestdao.deleteby(email);
//	resp.getWriter().print(msg);
	
	List<GuestDB> list=guestdao.fetchall();
	req.setAttribute("key", list);
	RequestDispatcher rd = req.getRequestDispatcher("Fetching.jsp");
	rd.forward(req, resp);
}
}
