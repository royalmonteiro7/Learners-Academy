package model;

import java.util.List;

public class TeachersService {

	public List<Teachers> retrieveListOfSubjects() {
		TeacherRepository teacherRepo = new TeacherRepository();

		List<Teachers> teachers = teacherRepo.retrieveTeacherDetails();

		return teachers;
	}

}
