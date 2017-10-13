package StudentRegAssignment;

public class Student {
	
	private String Name;
	private double StudentUsername;
	private String DOB;

	public Student(String name, String dob, double ID){
	
		this.Name = name;
		this.DOB = dob;
		this.StudentUsername = ID;
		
	}

	public String getName() {
		return this.Name;
	}

	public double getStudentUsername() {
		return this.StudentUsername ;
	}
	
	public String getDOB() {
		return this.DOB;
	}
	
	public String toString() {
        return "Student Name: " + this.Name + " Username: " + this.StudentUsername + "DOB:" + this.DOB;
    }

}
