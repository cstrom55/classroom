import static org.junit.Assert.*;
import org.junit.Test;
import otherclasses.*;

public class TestClassroom {
	
	@Test
	public void ClassroomTest() {
		
	
	}
	@Test
	public void PersonTest(){
		Person pers = new Person("Christian", "Str�m", 24, 'M');
		pers.setFirstName("Nils");
		assertEquals(pers.getFirstName(), "Nils");
		pers.setLastName("H�gg");
		assertEquals(pers.getLastName(), "H�gg");
		pers.setAge(12);
		assertEquals(pers.getAge(), 12);
		pers.setGender('F');
		assertEquals(pers.getGender(), 'F');
	}
	@Test
	public void StudentTest(){
		
	}

}
