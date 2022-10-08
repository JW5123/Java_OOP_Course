package Java10;
class Caaa{
    private int num;
    public Caaa(int n){
        num = n;
    }
    public int get(){
        return num;
    }
}
class Cbbb extends Caaa{
    public Cbbb(){
        super(2);   //Call the parent class constructor from child class
    }
    public void show(){
        System.out.printf("num = %d\n", get());
    }
}
public class Class05 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb();
        bb.show();
    }
}
