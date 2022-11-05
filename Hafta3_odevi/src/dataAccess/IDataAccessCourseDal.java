package dataAccess;

import java.util.ArrayList;

import section.course;

public interface IDataAccessCourseDal {
	public static ArrayList<course> courseArrayList = new ArrayList<course>();
	void add(course course);
	
}
