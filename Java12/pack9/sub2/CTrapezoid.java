package Java12.pack9.sub2;

public class CTrapezoid {
    private int upper;
    private int base;
    private int height;
    
    public CTrapezoid(int u, int b, int h){
        upper = u;
        base = b;
        height = h;
    }

    public void show(){
        System.out.println("upper = " + upper);
        System.out.println("base = " + base);
        System.out.println("height = " + height);
        System.out.println("area = " + (upper + base) * height / 2.0);
    }
}
