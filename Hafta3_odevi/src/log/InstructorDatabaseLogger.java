package log;

import section.instructor;

public class InstructorDatabaseLogger implements InstructorLogger {

	@Override
	public void log(instructor instructor) {
		// TODO Auto-generated method stub
		System.err.println("Eğitmen Database server loglandı");
		
	}

}
