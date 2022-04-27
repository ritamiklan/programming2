package hashmap;

public class Course {

	private String courseCode;
	private String name;
	private String credits;

	public Course(String courseCode, String name, String credits) {

		this.courseCode = courseCode;
		this.name = name;
		this.credits = credits;

	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getName() {
		return name;
	}

	public String getCredits() {
		return credits;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return courseCode + ": " + name + ", " + credits;
	}

}