package chapter6TimeDependent;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter6TimeDependent.chapter611timeDepedent;

public class chapter611timeDependentTest {

	@Test
	public void shouldSayGoodMorningInTheMorning() {
		chapter611timeDepedent hello = new chapter611timeDepedent();
		assertEquals("Good Morning!", hello.sayHello());
	}

	@Test
	public void shouldSayGoodAfternoonInTheAfternoon() {
		
		chapter611timeDepedent hello = new chapter611timeDepedent();
		assertEquals("Good Afternoon!", hello.sayHello());

	}
}
