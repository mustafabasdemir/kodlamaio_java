package section;

public class instructor {

	private int instructorId;
	private String instructorName;
	
	public instructor(int instructorId,String instructorName)
	{
		this.instructorId=instructorId;
		this.instructorName=instructorName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
}
