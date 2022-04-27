package inheritanceAndInterface;

public class Student extends Person {

	private int credits;

	public Student(String name) {
		super(name);
		credits = 0;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void completeCourse() {

		credits = credits + 5;

	}

	@Override
	public String toString() {
		return "Student: " + name + ", " + credits + " credits.";
	}

}
