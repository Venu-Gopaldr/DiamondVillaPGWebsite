package diamondvilla.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import diamondvilla.dto.GuestDB;

public class Guestdao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("DV");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public String insert(GuestDB guestDB ) {
		entityTransaction.begin();
		entityManager.persist(guestDB);
		entityTransaction.commit();
		return "Record inserted Successfully!";
	}
	
	public Object fetch(String email) {
		if(email != null) {
			GuestDB res = entityManager.find(GuestDB.class, email);	
			return res;
		}else {
			return "No Record Matched!";
		}
		
	}
	
	public String deleteby(String email) {
		GuestDB obj = entityManager.find(GuestDB.class, email);
		if(obj != null) {
			entityTransaction.begin();
			entityManager.remove(obj);
			entityTransaction.commit();
			return "Record Deleted Succesfully!!";
		}else {
			return "Record Not Found";
		}
		
	}
	
	public List<GuestDB> fetchall() {
		Query q = entityManager.createQuery("select a from GuestDB a");
		List<GuestDB> l = q.getResultList();
		if(l.isEmpty()) {
			return null;
		}else {
			return l;
		}
	}
}
