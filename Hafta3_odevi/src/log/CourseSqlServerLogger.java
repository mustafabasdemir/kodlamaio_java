package log;

import section.course;

public class CourseSqlServerLogger implements ICourseLogger {

	@Override
	public void log(course course) {
		// TODO Auto-generated method stub
		
		System.err.println("Kurs Sql server loglandı");
		
	}

}
