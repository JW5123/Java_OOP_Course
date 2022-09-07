package Java08;

class CBox{
    int length;
    int width;
    int height;

    int volume(){
        return length * width * height;
    }
    int surfaceArea(){
        return 2 * ((length * width) + (width * height) + (length * height));
    }
    void showData(){
        System.out.printf("length = %d\n", length);
        System.out.printf("width = %d\n", width);
        System.out.printf("height = %d\n", height);
    }
    void showAll(){
        showData();
        System.out.printf("surfaceArea = %d\n", surfaceArea());
        System.out.printf("volume = %d\n", volume());
    }
}
public class Class05 {
    public static void main(String[] args) {
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}
