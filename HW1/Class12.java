class CWin{
    int width;
    int height;
    String name;

    void setW(int w){
        width = w;
    }
    void setH(int h){
        height = h;
    }
    void setName(String s){
        name = s;
    }
    void show(){
        System.out.printf("Name = %s\n", name);
        System.out.printf("W = %s, H = %s\n", width, height);
    }
    void setWindows(int w, int h){
        width = w;
        height = h;
    }
    void setWindows(int w, int h, String s){
        width = w;
        height = h;
        name = s;
    }
}
public class Class12 {
    public static void main(String[] args) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();

        cw.setName("Win1");
        cw.setWindows(30, 15);
        cw.show();

        cw.setWindows(10, 5, "Win2");
        cw.show();
    }
}
