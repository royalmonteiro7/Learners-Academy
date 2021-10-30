package model;

import java.util.List;

import org.hibernate.Session;

public class TeacherRepository {

	public List<Teachers> retrieveTeacherDetails() {

		HibernateUtil util = new HibernateUtil();

		Session session = util.initializeConnection();

		String hibernateQuery = "select s from Teachers s";
		List<Teachers> teachers = session.createQuery(hibernateQuery, Teachers.class).getResultList();

		util.closeSession();
		return teachers;
	}

}
