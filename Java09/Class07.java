package Java09;
class Cmath{
    public static void power(int x, int n){
        System.out.printf("%d ^ %d = %d\n", x, n, (int)Math.pow(x, n));
    }
}
public class Class07 {
    public static void main(String[] args) {
        Cmath.power(2, 5);
        Cmath.power(3, 2);
    }
}
