package StudentRegAssignment;

import StudentRegAssignment.Student;
import junit.framework.TestCase;

public class StudentRegTest extends TestCase {

	public void testGetUserName() {
		
		//String StudentName = "Saoirse Kearse";
		double StudentUsername = 14417498;
		double expected = StudentUsername;
		Student Student = new Student("Saoirse","30/08/1997",14417498);
		double result = Student.getStudentUsername();
		assertEquals(expected, result);
    }
	
}
