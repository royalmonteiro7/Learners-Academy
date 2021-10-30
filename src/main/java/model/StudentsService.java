package model;

import java.util.List;

public class StudentsService {

	public List<Students> retrieveListOfStudents() {
		StudentRepository studentRepo = new StudentRepository();

		List<Students> students = studentRepo.retrieveStudentsDetails();

		return students;
	}

}
