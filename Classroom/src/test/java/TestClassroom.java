import static org.junit.Assert.*;
import org.junit.Test;
import otherclasses.*;
import java.util.ArrayList;

public class TestClassroom {
	@Test
	public void PersonTest(){
		Person pers = new Person("Christian", "Ström", 24, 'M');
		pers.setFirstName("Nils");
		assertEquals(pers.getFirstName(), "Nils");
		pers.setLastName("Hägg");
		assertEquals(pers.getLastName(), "Hägg");
		pers.setAge(12);
		assertEquals(pers.getAge(), 12);
		pers.setGender('F');
		assertEquals(pers.getGender(), 'F');
	}
	@Test
	public void StudentTest(){
		Student stu = new Student("Christian", "Ström", 24, 'M', 8.0, 8.0, 8.0);
		Student stu2 = new Student("Christian", "Ström", 24, 'M');
		stu.setFirstName("Nils");
		assertEquals(stu.getFirstName(), "Nils");
		stu.setLastName("Hägg");
		assertEquals(stu.getLastName(), "Hägg");
		stu.setAge(12);
		assertEquals(stu.getAge(), 12);
		stu.setGender('F');
		assertEquals(stu.getGender(), 'F');
		stu.setFirstGrade(9.0);
		assertEquals(stu.getFirstGrade(), 9.0, 0.0);
		stu.setSecondGrade(9.0);
		assertEquals(stu.getSecondGrade(), 9.0, 0.0);
		stu.setThirdGrade(9.0);
		assertEquals(stu.getThirdGrade(), 9.0, 0.0);
		stu.calculateAverage();
		assertEquals(stu.getAverageGrade(), 9.0, 0.0);
		stu.calculateAverage(20.0, 20.0, 20.0);
		assertEquals(stu.getAverageGrade(), 20.0, 0.0);
		stu.setAverageGrade(10.0);
		assertEquals(stu.getAverageGrade(), 10.0, 0.0);
		stu.hasClearedTheCourse();
		stu.toString();
		stu.setAverageGrade(1.0);
		stu.hasClearedTheCourse();
		stu.toString();
	}
	@Test
	public void ClassroomTest(){
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Student> students2 = new ArrayList<Student>();
		Classroom cla = new Classroom("Test", "16", students);
		cla.setClassroomName("Testautomatiserare");
		assertEquals(cla.getClassroomName(), "Testautomatiserare");
		cla.setClassroomTerm("2016");
		assertEquals(cla.getClassroomTerm(), "2016");
		cla.setStudents(students2);
		assertEquals(cla.getStudents(), students2);
		cla.addANewStudent(new Student("Christian", "Ström", 24, 'M'));
		cla.removeAStudent("Nils");
		cla.removeAStudent("Christian");
		cla.printFullRelatory();
	}

}
