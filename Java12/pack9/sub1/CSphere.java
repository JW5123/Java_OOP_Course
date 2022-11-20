package Java12.pack9.sub1;

public class CSphere {
    final static double PI = 3.14;
    private double radius;

    public CSphere(double r){
        radius = r;
    }
    public void show(){
        System.out.println("radius = " + radius);
        System.out.println("volume = " + (4 / 3.0 * PI * radius * radius * radius));
    }
}
