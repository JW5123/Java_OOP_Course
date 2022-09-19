package Java09;
class CAdd{
    public static void add2n(int n){
        int sum = 0;
        sum = n * (n + 1) / 2;
        System.out.printf("1 + 2 +...+ %d = %d\n", n, sum);
    }
}
public class Class06 {
    public static void main(String[] args) {
        CAdd.add2n(5);
        CAdd.add2n(10);
    }
}
