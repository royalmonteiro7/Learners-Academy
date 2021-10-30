package model;

import java.util.List;

public class ClassesService {

	public List<Classes> retrieveListOfClasses() {
		
		ClassRepository classRepo = new ClassRepository();

		List<Classes> classes = classRepo.retrieveClassDetails();

		return classes;
	}

}
