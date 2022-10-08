package Java10;
class CTriangle{
    protected int base;
    protected int height;
    protected void show(){
        System.out.printf("base = %d, height = %d\n", base, height);
    }
}
class CData extends CTriangle{
    CData(int b, int h){
        base = b;
        height = h;
    }
    public void area(){
        show();
        System.out.printf("area = %.1f\n", base * height / 2.0);
    }
}
public class Class06 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8);
        obj.area();
    }
}
