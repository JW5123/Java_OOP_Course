package Java15.Class09;

class CTest extends Thread implements Runnable{
	private String id;
	private int sec;
	
	public CTest(String str, int s) {
		id = str;
		sec = s;
	}
	public void run() {
		for(int i = 0;i < 10;i++) {
			try {
				sleep(sec);
				System.out.println("Thread "+ id +" is running");
			}
			catch(InterruptedException e) {
			}
		}
	}
}
public class Class09 {
	public static void main(String[] args) {
		CTest r1 = new CTest("1", 1000);
		CTest r2 = new CTest("2",2500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}