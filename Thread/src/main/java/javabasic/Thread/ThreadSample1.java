package javabasic.Thread;

public class ThreadSample1 extends Thread {

	public static void main(String[] args) {
		Thread thread1 = new ThreadSample1();
		thread1.start();
	}
	
	public void run() {
		System.out.println("Thread1 start");
	}

}
