package model;

import java.util.List;

public class SubjectsService {

	public List<Subjects> retrieveListOfSubjects() {
		SubjectRepository subjectRepo = new SubjectRepository();

		List<Subjects> subjects = subjectRepo.retrieveSubjectDetails();

		return subjects;
	}

}
