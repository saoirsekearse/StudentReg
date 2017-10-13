package StudentRegAssignment;

import java.util.ArrayList;

import StudentRegAssignment.Student;

public class Subjects {

	private String SubjectName;
	private String SubjectCode;
	private static int SubjectNumber = 455;
	private ArrayList<Student> Student;
	
	public Subjects(String SubjectName){
		
		this.SubjectName = SubjectName;
		this.SubjectCode = "EE" + SubjectNumber;
		Student = new ArrayList<Student>(); 
		SubjectNumber++;
		
	}

	public void addStudent(Student s1) {
        Student.add(s1);
    }

    public ArrayList<Student> getStudent() {
        return Student;
    }

    public String toString() {
        return "Subject Code: " + this.SubjectCode + " Subject: " + this.SubjectName;
    }
}
