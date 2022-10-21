package Java11;
abstract class Math{
    protected int ans;
    public void show(){
        System.out.println("ans = " + ans);
    }
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
class Computer extends Math{
    public void add(int a, int b){
        ans = a + b;
    }
    public void sub(int a, int b){
        ans = a - b;
    }
    public void mul(int a, int b){
        ans = a * b;
    }
    public void div(int a, int b){
        ans = a / b;
    }
}
public class Class02 {
    public static void main(String[] args) {
        Computer cmp = new Computer();
        cmp.mul(3, 5);
        cmp.show();
    }
}
