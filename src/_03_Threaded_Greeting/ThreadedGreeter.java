package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	private int i;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	//	System.out.println(i);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
if(i<=50) {
	Thread x = new Thread(new ThreadedGreeter(i+1));
	x.start();
	System.out.println("Hello from thread number: " + i);
	try {
		x.join();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	}

}
