package prerequisites;

/*
 * There are 2 ways in this example to start a thread class, one is by extending other class that has 'Thread' class
 * or you can use 'Runnable' interface and implement it on second class.
 * The difference is if you extend 'Thread' class you don't need to make a new object in 'Thread' and passing your own object into 'Thread' and can be run right away.
 * In 'Runnable' interface, you need to make a new object from 'Thread' class and pass your own object to new Thread('yourobject');
 */

public class JavaThreadExample implements Runnable {
	private int threadNumber;
	JavaThreadExample(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from thread number "+threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
