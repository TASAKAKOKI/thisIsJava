package Thread4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*you can complicate things if you try to lock on the actual object that you want to write to
 * and it makes better practice to declare separte objects to avoid any possible confusions.
 */
public class Worker {
	private Random random = new Random();
	
	//creating Object class to lock.
	//private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	
	/*synchronized code blocks works similarly to synchronized methods.
	 * two threads can run these methods(stageOne() & stageTwo()) at the same time,
	 * but if one thread is already entered the synchronized code block,
	 * then second thread has to wait until it can run the synchronized code block.
	 * second thread have to wait until the first thread gets released this lock by exciting this code block.
	 * 
	 * since we're locking on different objects,
	 *  one thread can run the stuff while another thread running another stuff
	 *  
	 */
	public synchronized void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	public void stageTwo() {
		 synchronized (lock2) {
			 try {
				 Thread.sleep(1);
			 } catch (InterruptedException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 list2.add(random.nextInt(100));
		 }
	}
	public void process() {
		for(int i=0; i<1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public void main() {
		System.out.println("Starting...");
		
		long start = System.currentTimeMillis();
		
		
		Thread t1 = new Thread(new Runnable() {
		 	@Override
			public void run() {
				process();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
		 	@Override
			public void run() {
				process();
			}
		});
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time take " + (end - start) + "ms");
		System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
	}
}