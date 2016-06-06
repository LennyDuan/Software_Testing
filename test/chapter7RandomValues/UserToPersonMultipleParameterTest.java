package chapter7RandomValues;

import static org.junit.Assert.*;

import org.apache.commons.lang.RandomStringUtils;


import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.*;

import static junitparams.JUnitParamsRunner.*;



@RunWith(JUnitParamsRunner.class)
public class UserToPersonMultipleParameterTest {

	private static Object[] getRandomNames() {
		Object[] values = new Object[100];
		for (int i = 0; i < values.length; i++) {
			values[i] = $(RandomStringUtils.randomAlphabetic(8), RandomStringUtils.randomAlphabetic(12));
		}
		return values;
	}

	@Test
	@Parameters(method = "getRandomNames")
	public void shouldConvertUserNamesIntoPersonNick(String name, String surname) {
		User user = new User(name, surname);
		Person person = UserToPersonConverter.convert(user);
		assertEquals(name + " " + surname, person.getNick());
	}

}
