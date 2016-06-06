package chapter7RandomValues;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.commons.lang.*;

public class UserToPersonConverterTest {

	@Test
	public void shouldConvertUserNamesIntoPersonNick() {
		String name = RandomStringUtils.randomAlphabetic(8);
		String surname = RandomStringUtils.randomAlphabetic(12);
		
		User user = new User(name, surname);
		Person person = UserToPersonConverter.convert(user);
		
		assertEquals(name + " " + surname, person.getNick());
	}

}
