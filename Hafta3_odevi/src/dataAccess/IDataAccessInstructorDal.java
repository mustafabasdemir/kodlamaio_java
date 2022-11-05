package dataAccess;

import java.util.ArrayList;

import section.instructor;

public interface IDataAccessInstructorDal {
	public static ArrayList<instructor> instructorArrayList = new ArrayList<instructor>();
	
	void add(instructor instructor);
}
