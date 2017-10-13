package StudentRegAssignment;

import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Course {

	private ArrayList<Subjects> Subjects;
	private String CourseName;
	private String CourseCode;
	private ArrayList<Student> Students;
	private LocalDate StartDate;
	private LocalDate EndDate;
	
	
	public Course(String CourseName, String CourseCode, LocalDate Start, LocalDate End){
		this.CourseName = CourseName;
		this.CourseCode = CourseCode;
		this.StartDate = Start;
		this.EndDate = End;
		Subjects = new ArrayList<Subjects>();
		//Students = new ArrayList<Student>();
		
		
	}
	
	public void addSubject(Subjects sub1){
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
	
	public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> Student) {
        this.Students = Student;
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


