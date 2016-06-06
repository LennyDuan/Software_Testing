package chapter6Rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RetryTestRule implements TestRule{

	@Override
	public Statement apply(Statement arg0, Description arg1) {

		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {

				try {
					arg0.evaluate();
					return;
				} catch (AssertionError ae) {
					arg0.evaluate();
					return;
				}
			}
		};
		
		
		
		
		
	}

}
