package Java10;
class Caaa{
    public int num1, num2;
}
class Cbbb extends Caaa{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }

    public void show(){
        System.out.printf("num1 = %d\n", num1);
        System.out.printf("num2 = %d\n", num2);
    }
}
public class Class01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}
