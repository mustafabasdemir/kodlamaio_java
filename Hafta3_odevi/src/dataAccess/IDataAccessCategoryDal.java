package dataAccess;

import java.util.ArrayList;

import section.category;

public interface IDataAccessCategoryDal {
	public static ArrayList<category> categoryArrayList = new ArrayList<category>();
	void add(category category);
}
