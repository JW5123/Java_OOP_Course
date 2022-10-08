package Java10;
class Caaa{
    public int num1, num2;
    public Caaa(){
        num1 = 1;
        num2 = 1;
    }
}
class Cbbb extends Caaa{
    public Cbbb(){
        super();    //Calling constructor without parameters from the parent class
    }
    public void show(){
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
}
public class Class13 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb();
        bb.show();
    }
}
