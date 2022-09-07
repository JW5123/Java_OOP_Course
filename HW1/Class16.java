class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }
    void setRadius(int r){
        radius = r;
    }
    double surfaceArea(){
        return 4 * 3.14 * Math.pow(radius, 3);
    }
    double volume(){
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
    void showCenter(){
        System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
    }
}
public class Class16 {
    public static void main(String[] args) {
        CSphere cs = new CSphere();
        cs.setLocation(3, 4, 5);
        cs.setRadius(1);
        cs.showCenter();
        System.out.println("surfaceArea = " +  cs.surfaceArea());
        System.out.println("volume = " +  cs.volume());
    }
}
