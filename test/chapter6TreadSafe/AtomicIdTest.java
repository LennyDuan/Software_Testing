package chapter6TreadSafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtomicIdTest {

	private IdGenerator idGenerator = new AtomicIdGenerator();
	
	@Test
	public void idsShouldBeUniques() {
		Long idA = idGenerator.nextID();
		Long idB = idGenerator.nextID();
		
		assertNotEquals("IdA: " + idA + " IdB: " + idB, idA, idB);
		
	}

}