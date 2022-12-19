package Java15.Class09;

class QNine implements Runnable{
	String s = "";
	float sec = 0;
	public QNine(String in,float se) {
		s = in;
		sec = se;
	}
	public void run() {
		for(int i = 0;i < 10;i++) {
			try {
				Thread.sleep((long)sec*1000);
			}
			catch(InterruptedException e) {}
			System.out.println("Thread "+s+" is running");
		}
	}
}
public class Class09 {
	public static void main(String[] args) {
		QNine q1 = new QNine("1",(float)2.5);
		QNine q2 = new QNine("2",1);
		Thread t1 = new Thread(q1);
		Thread t2 = new Thread(q2);
		t1.start();
		t2.start();
	}

}