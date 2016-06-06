package chapter6TreadSafe;

import static org.junit.Assert.*;

import com.google.code.tempusfugit.concurrency.ConcurrentRule;
import com.google.code.tempusfugit.concurrency.RepeatingRule;
import com.google.code.tempusfugit.concurrency.annotations.Concurrent;
import com.google.code.tempusfugit.concurrency.annotations.Repeating;

import java.util.HashSet;
import java.util.Set;

import org.junit.Rule;
import org.junit.Test;

//Need Import Tempus-Fugit library
//ConcurrentRule, which sets the number of threads that are to execute a test method,
//RepeatingRule, which sets the total number of test method executions.

public class AtomicIdGeneratorParallelTest {

	 @Rule public ConcurrentRule concurrently = new ConcurrentRule();
	    @Rule public RepeatingRule repeatedly = new RepeatingRule();
	    private IdGenerator idGen = new AtomicIdGenerator();
	    private Set<Long> ids = new HashSet<Long>(100);
	    @Test
	    @Concurrent(count = 7)
	    @Repeating(repetition = 100)
	    public void idsShouldBeUnique() {
	        assertTrue(ids.add(idGen.nextID()));
	    }
	}
