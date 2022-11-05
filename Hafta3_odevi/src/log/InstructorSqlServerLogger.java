package log;

import section.instructor;

public class InstructorSqlServerLogger implements InstructorLogger {

	@Override
	public void log(instructor instructor) {
		// TODO Auto-generated method stub
		
		System.err.println("Eğitmen Sql server loglandı");
		
	}

}
