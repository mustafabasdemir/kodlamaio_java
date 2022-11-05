package section;

public class course {
	
	private int courseId;
	private String courseName;
	private int instructorİd;
	private int coursePrice;
	
	public course(int courseId,String courseName,int instructorİd,int coursePrice)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.instructorİd=instructorİd;
		this.coursePrice=coursePrice;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorİd() {
		return instructorİd;
	}

	public void setInstructorİd(int instructorİd) {
		this.instructorİd = instructorİd;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	

}
