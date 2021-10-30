package model;

import java.util.List;

import org.hibernate.Session;

public class ClassRepository {

	public List<Classes> retrieveClassDetails() {
		HibernateUtil util = new HibernateUtil();

		Session session = util.initializeConnection();

		String hibernateQuery = "select c from Classes c";
		List<Classes> classes = session.createQuery(hibernateQuery, Classes.class).getResultList();

		util.closeSession();
		return classes;
	}

}
