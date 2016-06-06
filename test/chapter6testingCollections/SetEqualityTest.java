package chapter6testingCollections;

import static org.junit.Assert.*;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.unitils.*;
import org.unitils.reflectionassert.ReflectionComparatorMode;

public class SetEqualityTest {
	Set<String> setA = new LinkedHashSet<String>();
	Set<String> setB = new LinkedHashSet<String>();

	
	@Before
	public void setUp() {
		String s1 = "s1";
		String s2 = "s2";
		setA.add(s1);
		setA.add(s2);
		setB.add(s2);
		setB.add(s1);
	}
	
	@Test
	public void twoSetsAreEqualsifTheyHaveSameOrderandValue() {
		
		assertReflectionEquals(setA, setB);
	}
	
	@Test
	public void twoSetsAreEqualsifTheyHaveAnyOrderandSameValue() {
		assertReflectionEquals(setA, setB, ReflectionComparatorMode.LENIENT_ORDER);
	}
	

}
