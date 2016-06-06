package chapter6Asynchronous;

import java.util.concurrent.ExecutorService;

import com.sun.jmx.snmp.tasks.TaskServer;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

//Unimplement Class and Test
public class Server {

	private final ExecutorService executorService;
	private final TaskService taskServive;
	
	public Server(ExecutorService executorService, TaskServive taskServive) {
		this.executorService = executorService;
		this.taskServer = taskServer;
	}
	
	public void serve(Request request){
		for (Task task: request.getTasks()) {
			executorService.submit(new TaskHandler(taskServer, task));
		}
	}
	
	private class TaskHandler implements Runnable {

		private final TaskService taskService;
		private final Task task;
		
		public public TaskHandler(TaskService taskService, Task task) {
			// TODO Auto-generated constructor stub
			this.taskService = taskService;
			this.task = task;
		}
		@Override
		public void run() {
			taskService.handle(task);
			
		}
		
	}
}
