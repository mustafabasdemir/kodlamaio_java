package Bussiness;

import dataAccess.IDataAccessInstructorDal;
import dataAccess.IDataListView;
import log.InstructorLogger;
import section.instructor;

public class InstructorManager {


	IDataAccessInstructorDal iDataAccessInstructorDal;
	IDataListView iDataListView;
	InstructorLogger[] instructorLoggers;
	
	public InstructorManager(IDataAccessInstructorDal iDataAccessInstructorDal,InstructorLogger[] instructorLoggers)
	{
		this.iDataAccessInstructorDal=iDataAccessInstructorDal;
		this.instructorLoggers=instructorLoggers;
		
	}
	
	public void add(instructor instructor){


			iDataAccessInstructorDal.add(instructor);
		
			

		for (InstructorLogger instructorLogger : instructorLoggers) {

			instructorLogger.log(instructor);
		}

		System.out.println(" ");
		}

	
	public void instructorList() {

		System.out.println("<<<<<<<<<<All Category List>>>>>>>>>>");
		iDataListView.ViewList();
	}
	
}
