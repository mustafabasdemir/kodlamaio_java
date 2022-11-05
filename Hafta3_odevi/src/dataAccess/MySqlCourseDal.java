package dataAccess;

import section.course;

public class MySqlCourseDal implements IDataAccessCourseDal,IDataListView{

	@Override
	public void add(course course) {
		System.out.println("Kurs MySql veri tabanına eklendi : " + course.getCourseId() + ")" + course.getCourseName());
		IDataAccessCourseDal.courseArrayList.add(course);
		
	}

	@Override
	public void ViewList() {
		// TODO Auto-generated method stub
		for (int i = 0; i < IDataAccessCourseDal.courseArrayList.size(); i++) {
			System.out.println( IDataAccessCourseDal.courseArrayList.get(i).getCourseId()+IDataAccessCourseDal.courseArrayList.get(i).getCourseName()
								+IDataAccessCourseDal.courseArrayList.get(i).getInstructorİd()+IDataAccessCourseDal.courseArrayList.get(i).getCoursePrice());
		}
		
	}

}
