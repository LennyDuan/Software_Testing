package chapter6TreadSafe;


import com.sun.xml.internal.ws.api.pipe.NextAction;

public class AtomicIdGenerator implements IdGenerator{

	private static Long nextId = System.currentTimeMillis();
	
	public Long nextID() {
		return nextId++;
	}
}
