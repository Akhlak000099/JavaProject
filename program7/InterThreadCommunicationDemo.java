package program7;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SynchronizedThreads st = new SynchronizedThreads();
		producer p = new producer(st);
		consumer c = new consumer(st);
		System.out.println("Press Ctrl+C to Stop");
		
		p.start();
	    c.start();
		
	}

}
