package diamondvilla.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diamondvilla.dao.Guestdao;
import diamondvilla.dto.GuestDB;

@WebServlet("/DVA")
public class Getdata extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String aadhar = req.getParameter("aadhar");
	String email = req.getParameter("email");
	long mobile = Long.parseLong(req.getParameter("mobile"));
	String loc = req.getParameter("location");
	int floor = Integer.parseInt(req.getParameter("floor"));
	String flat = req.getParameter("flat");
	Double rent = Double.parseDouble(req.getParameter("rent"));
	
	GuestDB guestDB = new GuestDB();
	guestDB.setGname(name);
	guestDB.setGaadhar(aadhar);
	guestDB.setGemail(email);
	guestDB.setMobile(mobile);
	guestDB.setLoc(loc);
	guestDB.setFloor(floor);
	guestDB.setFlat(flat);
	guestDB.setRent(rent);
	
	Guestdao guestdao = new Guestdao();
	String msg = guestdao.insert(guestDB);
	resp.getWriter().print(msg);
}
}
