package Java10;
class Caaa{
    public int num1, num2;
    public Caaa(){
        num1 = 1;
        num2 = 2;
    }
    public Caaa(int a, int b){
        num1 = a;
        num2 = b;
    }
}
class Cbbb extends Caaa{
    public Cbbb(int a, int b){
        super(a, b);    //Calling constructor parameters from the parent class
    }
    public void show(){
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
}
public class Class14 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2, 9);
        bb.show();
    }
}
