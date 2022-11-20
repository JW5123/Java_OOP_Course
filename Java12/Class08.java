package Java12;
import Java12.pack6.subpack1.CCircle;
import Java12.pack6.subpack2.CRectangle;
import Java12.pack6.subpack1.subsubpack.CStyle;
public class Class08 {
    public static void main(String[] args) {
        CCircle cir = new CCircle();
        CRectangle rect = new CRectangle();
        CStyle sty = new CStyle(1);
        cir.show();
        rect.show();
    }
}
