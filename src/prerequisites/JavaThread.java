package prerequisites;

public class JavaThread {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			JavaThreadExample myThread = new JavaThreadExample(i);
			Thread threading = new Thread(myThread);
			threading.start();
		}
	}

	
}
