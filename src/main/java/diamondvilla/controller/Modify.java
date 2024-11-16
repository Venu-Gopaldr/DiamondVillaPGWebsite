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

@WebServlet("/update")
public class Modify extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String aadhhar = req.getParameter("aadhar");
		String email = req.getParameter("email");
		long mob = Long.parseLong(req.getParameter("mobile"));
		String loc = req.getParameter("location");
		int floor = Integer.parseInt(req.getParameter("floor"));
		String flat = req.getParameter("flat");
		int share = Integer.parseInt(req.getParameter("share"));
		double rent = Double.parseDouble(req.getParameter("rent"));
		
		GuestDB guestDB = new GuestDB();
		guestDB.setGname(name);
		guestDB.setGaadhar(aadhhar);
		guestDB.setGemail(email);
		guestDB.setMobile(mob);
		guestDB.setLoc(loc);
		guestDB.setFloor(floor);
		guestDB.setFlat(flat);
		guestDB.setShare(share);
		guestDB.setRent(rent);
		
		Guestdao guestdao = new Guestdao();
		guestdao.update(guestDB);
		
		List<GuestDB> l = guestdao.fetchall();
		req.setAttribute("key", l);
		RequestDispatcher rd = req.getRequestDispatcher("Fetching.jsp");
		rd.forward(req, resp);
	}

}
