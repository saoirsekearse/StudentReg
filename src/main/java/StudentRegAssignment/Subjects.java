package StudentRegAssignment;

import java.util.ArrayList;

import StudentRegAssignment.Student;

public class Subjects {

	private String SubjectName;
	private String SubjectCode;
	private static int SubjectNumber = 455;
	private ArrayList Student;
	
	public Subjects(String SubjectName){
		this.SubjectName = SubjectName;
		this.SubjectCode = "EE" + SubjectNumber;
		this.Student = new ArrayList(); 
		SubjectNumber++;
	}

	private String getSubjectCode() {
        return this.SubjectCode;
    }

    private String getSubjectName() {
        return this.SubjectName;
    }

    public void addStudent(Student s) {
        Student.add(s);
    }

    public void setStudent(ArrayList<Student> s) {
        this.Student = s;
    }

    public ArrayList<Student> getStudent() {
        return this.Student;
    }

    public String toString() {
        return "Subject Code: " + this.SubjectCode + " Title: " + this.SubjectName;
    }
}
