package chapter6Asynchronous;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

import org.junit.Test;

public class AsychronouseTesting {

	@Test
	public void shouldSaveTasksUsingTryCatch() throws InterruptedException {
	    final TaskService taskService = mock(TaskService.class);
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    final Task task = mock(Task.class);
	    Collection<Task> listOfTasks = Arrays.asList(task);
	    Server server = new Server(executorService, taskService);
	    server.serve(listOfTasks);
	    boolean handleMethodInvoked = false;
	    for (int i = 0; i < 10; i++) {
	        try {
	            verify(taskService).handle(task);
	            handleMethodInvoked = true;
	        }
	        catch (AssertionError e) {
	            // no need to do anything
	        }
	        Thread.sleep(100);
	    }
	    assertTrue(handleMethodInvoked);
	}
}
