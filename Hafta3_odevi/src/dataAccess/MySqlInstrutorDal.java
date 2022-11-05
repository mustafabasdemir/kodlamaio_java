package dataAccess;

import section.instructor;

public class MySqlInstrutorDal implements IDataAccessInstructorDal,IDataListView {

	@Override
	public void add(instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Eğitmen  MySql veri tabanına eklendi : " + instructor.getInstructorId() + ")" + instructor.getInstructorName());
		IDataAccessInstructorDal.instructorArrayList.add(instructor);
		
	}

	@Override
	public void ViewList() {
		// TODO Auto-generated method stub
		for (int i = 0; i < IDataAccessInstructorDal.instructorArrayList.size(); i++) {
			System.out.println(  IDataAccessInstructorDal.instructorArrayList.get(i).getInstructorId()+ IDataAccessInstructorDal.instructorArrayList.get(i).getInstructorName());
		}
		
	}
}
