package Java111Q1;
class Cal_area{
    public double pi = 3.14159;
    public double Ball_area(double r){
        return (4 * pi * Math.pow(r, 3)) / 3;
    }
    public int Cube_area(int a, int b, int c){
        return  ((a * b) + (b * c) + (c * a)) * 2;
    }
}
public class Class01 {
    public static void main(String[] args) {
        Cal_area ca = new Cal_area();
        System.out.printf("Ball_area = %lf\n", ca.Ball_area(10));
        System.out.printf("Cube_area = %d\n", ca.Cube_area(4, 5, 6));
    }
}
