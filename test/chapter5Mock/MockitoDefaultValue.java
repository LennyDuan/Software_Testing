package chapter5Mock;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertTrue;

public class MockitoDefaultValue {

	private Car myFerrari = mock(Car.class);

	@SuppressWarnings("deprecation")
	@Test
	public void mockitoDefaultValueTest() {
		assertFalse("new test double should return false as boolean", myFerrari.needsFuel());
	}

}
