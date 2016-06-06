package chapter6TimeDependent;

import java.util.Calendar;

public class chapter611timeDepedent {

	public String sayHello() {
		Calendar current = Calendar.getInstance();
		
		if(current.get(Calendar.HOUR_OF_DAY) < 12) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}
