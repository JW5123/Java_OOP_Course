// (A)
package Java11;
interface iVolume{
    public void showData();
    public double vol();
}
abstract class CSphere implements iVolume{
    final double PI = 3.14;
    protected int x;
    protected int y;

    /*  (C)
    protected int radius;
    public void showData(){
        System.out.printf("球心: (%d, %d)\n", x, y);
        System.out.println("半徑: " + radius);
        System.out.printf("球體積: %.2f\n", vol());
    }
    public double vol(){
        return ((4.0 / 3) * PI * radius * radius * radius);
    }
    */
}
class CCircle1 extends CSphere{
    protected int radius;

    public CCircle1(int a, int b, int r){
        x = a;
        y = b;
        radius = r;
    }
    public void showData(){
        System.out.printf("球心: (%d, %d)\n", x, y);
        System.out.println("半徑: " + radius);
        System.out.printf("球體積: %.2f\n", vol());
    }
    public double vol(){
        return ((4.0 / 3) * PI * radius * radius * radius);
    }
}
public class Class14 {
    public static void main(String[] args) {
        CCircle1 cir = new CCircle1(8, 6, 2);
        cir.showData();
    }
}
/*
(B) 因爲CCircle繼承抽象類別CSphere所以需改寫CSphere的method，
因此就算CSphere沒有實作介面iVolume，但藉由CCircle改寫也能替CSphere完成實作
*/