package Java08;

class CBox{
    int length;
    int width;
    int height;
}
public class Class04 {
    public static void main(String[] args) {
        CBox box = new CBox();
        box.length = 15;
        box.width = 10;
        box.height = 25;
        System.out.printf("length= %d\n", box.length);
        System.out.printf("length= %d\n", box.width);
        System.out.printf("length= %d\n", box.height);
    }
}
