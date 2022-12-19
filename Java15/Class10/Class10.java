package Java15.Class10;

class CTest3 implements Runnable{
   private String id;
   public CTest3(String str){
      id=str;
   }
   public void run(){
      for(int i = 0;i <= 5;i++){
         try {
        	 Thread.sleep((int)Math.random()*2);
         }catch(InterruptedException e) {}
    	 System.out.println(id+" "+i);
      }
   }
}
public class Class10 {
	public static void main(String[] args) {
		CTest3 hi = new CTest3("Hello");
		CTest3 bye = new CTest3("Good Bye");
		CTest3 mornig = new CTest3("Good mornig");
		CTest3 night = new CTest3("Good night");
		Thread h = new Thread(hi);
		Thread b = new Thread(bye);
		Thread m = new Thread(mornig);
		Thread n = new Thread(night);
		h.start();
		b.start();
		m.start();
		n.start();
	}

}