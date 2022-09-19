package Java09;
class CRectangle{
    int width;
    int height;

    CRectangle(int w, int h){
        width = w;
        height = h;
    }//problem a

    CRectangle(){
        width = 10;
        height = 8;
    }//problem b
    /*
    CRectangle(){
        this(10, 8)
    }
    problem c
    */
    void show(){
        System.out.println("width= " + width);
        System.out.println("height= " + height);
    }
}
public class Class01 {
    public static void main(String[] args) {
        CRectangle rec1 = new CRectangle(2, 3);
        rec1.show();
        CRectangle res2 = new CRectangle();
        res2.show();
    }
}
