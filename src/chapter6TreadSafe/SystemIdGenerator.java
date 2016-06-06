package chapter6TreadSafe;

public class SystemIdGenerator implements IdGenerator{

	@Override
	public Long nextID() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
	}

}
