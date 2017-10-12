package StudentRegAssignment;

import java.util.ArrayList;

public class Student {
	
	private String Name;
	private int StudentID;
	private String StudentUsername;
	private String DOB;
	private ArrayList<Subjects> Subjects;
	private Course Course;

	public Student(String name, String dob, int ID){
	
		this.Name = name;
		this.DOB = dob;
		this.StudentID = ID;
		
		Subjects = new ArrayList<Subjects>();
		
	}

	public String getName() {
		return this.Name;
	}
	
	public int getStudentID() {
		return this.StudentID;
	}

	public String getStudentUsername() {
		return this.StudentID + "@NUIGALWAY.IE";
	}
	
	public String getDOB() {
		return this.DOB;
	}
	
	public ArrayList<Subjects> getSubjects(){
			return Subjects;
	}
	
	public void setSubjects(ArrayList<Subjects> Subjects){
		this.Subjects = Subjects;
	}
	
	public Course getCourse(){
		return Course;
		
	}
	
	public void setCourse(Course Course){
		this.Course = Course;
	}

}
