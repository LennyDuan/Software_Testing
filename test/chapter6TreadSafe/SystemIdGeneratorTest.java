package chapter6TreadSafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class SystemIdGeneratorTest {

	private IdGenerator idGenerator = new SystemIdGenerator();
	
	@Test
	public void idsShouldBeUniques() {
		Long idA = idGenerator.nextID();
		Long idB = idGenerator.nextID();
		
		assertNotEquals("IdA: " + idA + " IdB: " + idB, idA, idB);
		
	}

}
