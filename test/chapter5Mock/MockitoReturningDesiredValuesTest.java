package chapter5Mock;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockitoReturningDesiredValuesTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testStubbing() {

		assertFalse("new test double should return false as boolean", myFerrari.needsFuel());

		when(myFerrari.needsFuel()).thenReturn(true);

		assertTrue("after instructed test double should return what we want", myFerrari.needsFuel());
	}

	@Test(expected = RuntimeException.class)
	public void throwException() {
		when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
		myFerrari.needsFuel();
	}

	@Test
	public void testVertification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();
		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
		
		myFerrari.getEngineTemperature();
		verify(myFerrari).getEngineTemperature();
	}

}
