package Java09;
class CCount{
    static int cnt = 0;

    CCount(){
        cnt++;
    }

    static void setZero(){
        cnt = 0;
    }

    static void setValue(int n){
        cnt = n;
    }
    
    static void show(){
        System.out.println("cnt=" + cnt);
    }
}
public class Class05 {
    public static void main(String[] args) {
        CCount cn1 = new CCount();
        CCount cn2 = new CCount();
        CCount.show();

        CCount.setZero();
        CCount.show();

        CCount.setValue(10);
        CCount.show();
    }
}

// (d) 類別變數
// (f) 類別函數