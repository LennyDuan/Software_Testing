package chapter6Rules;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import sun.reflect.generics.tree.VoidDescriptor;

public class RetryRuleTest {

	@Rule
	public RetryTestRule retryTestRule = new RetryTestRule();

	static int excutionNumber = 0;
	
	@Test
	public void shouldBeRerun() {
		excutionNumber++;
		System.out.println("execution: " + excutionNumber);
		Assert.fail("failing: " + excutionNumber);
	}
}
