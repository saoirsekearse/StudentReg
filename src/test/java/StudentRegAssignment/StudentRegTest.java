package StudentRegAssignment;

import StudentRegAssignment.Student;
import junit.framework.TestCase;

public class StudentRegTest extends TestCase {

	public void testGetUserName() {
		
		String StudentName = "Saoirse Kearse";
		int StudentID = 114417498;
		String expected = StudentID + "@NUIGALWAY.IE";
		Student Student = new Student("Saoirse","30/08/1997",14417498);
		String actual = Student.getStudentUsername();
		assertEquals(expected,actual);
    }
	
}
