package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	private Thread[] array;
	private ConcurrentLinkedQueue<Task> taskQueue;
	public ThreadPool(int totalthreads) {
		// TODO Auto-generated constructor stub
		array = new Thread[totalthreads];
		taskQueue = new ConcurrentLinkedQueue<Task>();
		for(int i=0;i<array.length;i++) {
			array[i] = new Thread(new Worker(taskQueue));
		}
			
	}

	

	public void start() {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			array[i].start();
			try {
				array[i].join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskQueue.add(task);
	}

}
