import Bussiness.CategoryManager;
import Bussiness.CourseManager;
import Bussiness.InstructorManager;
import dataAccess.MySqlCategoryDal;
import dataAccess.MySqlCourseDal;
import dataAccess.MySqlInstrutorDal;
import log.CategoryDatabaseLogger;
import log.CategorySqlServerLogger;
import log.CourseDatabaseServerLogger;
import log.CourseSqlServerLogger;
import log.ICategoryLogger;
import log.ICourseLogger;
import log.InstructorDatabaseLogger;
import log.InstructorLogger;
import log.InstructorSqlServerLogger;
import section.category;
import section.course;
import section.instructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kurs eklendi
		course course = new course(1, "Java Kampı",01 , 1500);
		//kurs loglandı
		ICourseLogger[] loggers = {new CourseDatabaseServerLogger() , new CourseSqlServerLogger() };
		
		CourseManager courseManager = new CourseManager(new MySqlCourseDal(), loggers);
		courseManager.add(course);
		
		ICategoryLogger[] categoryLoggers = { new CategoryDatabaseLogger(), new CategorySqlServerLogger() };
		category Catecory = new category(1, "Back-end Software");
		category Catecory2 = new category(2, "Front-end Software");

		CategoryManager categoryManager = new CategoryManager(new MySqlCategoryDal(), categoryLoggers);
		categoryManager.add(Catecory);
		categoryManager.add(Catecory2);
		//categoryManager.CategoryList();
		
		InstructorLogger[] instructorLoggers = { new InstructorDatabaseLogger(), new InstructorSqlServerLogger()};
		instructor instructor = new instructor(01, "engin demirog");
		
		InstructorManager instructorManager = new InstructorManager(new MySqlInstrutorDal(), instructorLoggers);
		instructorManager.add(instructor);
	
	}

}
