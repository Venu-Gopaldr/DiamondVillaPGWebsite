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

@WebServlet("/fa")
public class FetchAll extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Guestdao guestdao = new Guestdao();
	List<GuestDB> o=guestdao.fetchall();
	req.setAttribute("key", o);
	RequestDispatcher rd = req.getRequestDispatcher("Fetching.jsp");
	rd.forward(req, resp);
}
}
