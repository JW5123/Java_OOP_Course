package Java15.Class10;

class CTest implements Runnable{
   private String id;
   public CTest(String str){
      id = str;
   }
   public void run(){
      for(int i = 1;i <= 5;i++){
         try {
        	 Thread.sleep((int)(Math.random() * 2000));
         }catch(InterruptedException e) {}
    	 System.out.println(id + " " + i);
      }
   }
}
public class Class10 {
	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good Bye");
		CTest mornig = new CTest("Good mornig");
		CTest night = new CTest("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(mornig);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}