package Java111Q1;
class Area{
    public double pi = 3.14159;
    void Cal_area(int r){
        System.out.printf("半徑 = %d\n", r);
        System.out.printf("球形體積 = %.1f\n", (4 * pi * Math.pow(r, 3)) / 3);
    }
    void Cal_area(int a, int b, int c){
        System.out.printf("長 = %d 寬 = %d 高 = %d\n", a ,b, c);
        System.out.printf("球形體積 = %d\n", ((a * b) + (b * c) + (c * a)) * 2);
    }
}
public class Class01 {
    public static void main(String[] args) {
        Area ca = new Area();
        ca.Cal_area(10);
        ca.Cal_area(4, 5, 6);
    }
}
