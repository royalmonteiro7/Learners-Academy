package model;

import java.util.List;

import org.hibernate.Session;

public class SubjectRepository {

	public List<Subjects> retrieveSubjectDetails() {

		HibernateUtil util = new HibernateUtil();

		Session session = util.initializeConnection();

		String hibernateQuery = "select s from Subjects s";
		List<Subjects> subjects = session.createQuery(hibernateQuery, Subjects.class).getResultList();

		util.closeSession();
		return subjects;
	}

}
