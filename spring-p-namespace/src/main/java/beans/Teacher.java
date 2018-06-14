package beans;

public class Teacher {

	// Generate setters....
	private String name;
	private String qualification;
	private Student student;

	public void setName(String name) {
		this.name = name;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	// business logic
	public void display() {
		System.out.println("Teacher and Student details...........\n");
		System.out.println("Teacher name: " + name);
		System.out.println("Teacher qualification: " + qualification);
		System.out.println("Student name: " + student.getName());
		System.out.println("Student course: " + student.getCourse());
	}

}
