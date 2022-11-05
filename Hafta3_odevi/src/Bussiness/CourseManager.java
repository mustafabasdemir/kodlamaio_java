package Bussiness;
import dataAccess.IDataAccessCourseDal;
import dataAccess.IDataListView;
import log.ICourseLogger;
import section.course;

public class CourseManager {

	IDataAccessCourseDal iDataAccessCourseDal;
	IDataListView iDataListView;
	ICourseLogger[] courseLoggers;
	
	
	public CourseManager(IDataAccessCourseDal iDataAccessCategoryDal,ICourseLogger[] courseLoggers)
	{
		this.iDataAccessCourseDal=iDataAccessCategoryDal;
		this.courseLoggers=courseLoggers;
		
	}
	
	public void add(course course){


			iDataAccessCourseDal.add(course);
			

		for (ICourseLogger courseLogger : courseLoggers) {

			courseLogger.log(course);
		}

		System.out.println(" ");
		}

	
	public void CourseList() {
		iDataListView.ViewList();
	}
}
