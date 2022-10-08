package Java10;
class CRectangle{
    protected int length, width;

    public CRectangle(int l, int w){
        length = l;
        width = w;
    }
    public void println(){
        System.out.printf("length = %d, width = %d, area = %d\n", length, width, length * width);
    }
}
public class Class19 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);
        rect.println();
    }
}
