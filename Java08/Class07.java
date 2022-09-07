class CTest{
    void test(int n){
        System.out.printf("n=%d", n);
        if(n == 0)
            System.out.printf(" ,此數為0\n");
        else if(n % 2 == 0)
            System.out.printf(" ,此數為偶數\n");
        else
            System.out.printf(" ,此數為奇數\n");
    }
}
public class Class07 {
    public static void main(String[] args) {
        CTest c = new CTest();
        c.test(3);
        c.test(8);
        c.test(0);
    }
}
