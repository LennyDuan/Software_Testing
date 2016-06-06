package chapter64Phone;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.googlecode.catchexception.CatchException.*;

public class PhoneTestIAEWithCatchException {

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {

		catchException(phone).setNumber(null);
		assertTrue(caughtException() instanceof IllegalArgumentException);
		assertEquals("number can not be null or empty", caughtException().getMessage());
	}

	@Test
	public void shouldThrowIAEForPlusPrefixedNumber() {
		catchException(phone).setNumber("+123");
		assertTrue(caughtException() instanceof IllegalArgumentException);
		assertEquals("plus sign prefix not allowed, " + "number: [+123]", caughtException().getMessage());
	}

}
