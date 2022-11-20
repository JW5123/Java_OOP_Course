package Java09;
class CWin{
    static int cnt = 0;
    String color;
    int width;
    int height;

    void count(){
        cnt++;
    }

    CWin(String str, int w, int h){ //建構元
        color = str;
        width = w;
        height = h;
        count();
    }

    CWin(){
        this("Red", 2, 2);
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
public class Class08 {
    public static void main(String[] args) {
        CWin c1 = new CWin();
        CWin c2 = new CWin();
        CWin.show();

        CWin.setZero();
        CWin.show();

        CWin.setValue(10);
        CWin.show();
    }
}

// (f) 類別變數
// (g) 類別函數