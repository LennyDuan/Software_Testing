package chapter6TestingFromFile;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ReadCSVJUnitParamsTest {
	@Test
	@FileParameters(value = "src/chapter6TestingFromFile/financial.csv", mapper = CsvWithHeaderMapper.class)
	public void shouldCalculateDiscount(double value, double discount) {
		assertEquals(discount, DiscountCalculator.calculateDiscount(value), 0.0001);
	}
}