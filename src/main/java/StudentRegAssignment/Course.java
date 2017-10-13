package StudentRegAssignment;

import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Course {

	private ArrayList<Subjects> Subjects;
	private String CourseName;
	private String CourseCode;
	private ArrayList<Student> Student;
	private LocalDate StartDate;
	private LocalDate EndDate;
	
	
	public Course(String CourseName, String CourseCode, LocalDate Start, LocalDate End){
		this.CourseName = CourseName;
		this.CourseCode = CourseCode;
		this.StartDate = Start;
		this.EndDate = End;
		Subjects = new ArrayList<Subjects>();
		Student = new ArrayList<Student>();
		
		
	}
	
	public void addSubject(Subjects sub1){
		Student.addAll(sub1.getStudent());
		Subjects.add(sub1);
	}
	
	public String toString() {
        return "Course Code: " + CourseCode + " Course Name: " + CourseName;
    }
	

	public ArrayList<Subjects> getSubjects() {
		return Subjects;
	}

	public void setSubjects(ArrayList<Subjects> Subject) {
		this.Subjects = Subject;
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String CourseCode) {
		this.CourseCode = CourseCode;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;	
	}
	
	public void addStudent(Student s1) {
        Student.add(s1);
    }
	
	public ArrayList<Student> getStudents() {
        return getStudents();
    }
    
    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate StartDates) {
        this.StartDate = StartDates;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate EndDates) {
        this.EndDate = EndDates;
    }
}


