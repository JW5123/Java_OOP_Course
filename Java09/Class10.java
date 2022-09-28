package Java09;
class CRational{
    public int n;
    public int d;

    // (a)
    public void setN(int num){
        n = num;
    }

    public void setD(int num){
        d = num;
    }

    public void setND(int num, int den){
        n = num;
        d = den;
    }
}
public class Class10 {
    public static void main(String[] args) {
        CRational aaa = new CRational();
        CRational bbb = new CRational();
        aaa.setN(2);
        aaa.setD(5);
        show(aaa);
        bbb.setND(2, 3);
        show(bbb);
    }
    // (b)
    public static void show(CRational obj){
        System.out.printf("%d / %d\n", obj.n, obj.d);
    }
}
