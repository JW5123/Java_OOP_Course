package Java09;
class CRectangle{
    int width;
    int height;

    //problem a : Define CRectangle constructor, and with arguments are w、h
    CRectangle(int w, int h){
        width = w;
        height = h;
    }

    //problem b : Define CRectangle constructor, without arguments
    CRectangle(){
        width = 10;
        height = 8;
    }
    /*
    problem c : Define CRectangle constructor, using "this()" to set the width and height 
    CRectangle(){
        this(10, 8)
    }
    */
    // Print the width and height
    void show(){
        System.out.println("width= " + width);
        System.out.println("height= " + height);
    }
}
public class Class01 {
    public static void main(String[] args) {
        //Create object rec1
        CRectangle rec1 = new CRectangle(2, 3);
        rec1.show();
        //Create object rec2
        CRectangle res2 = new CRectangle();
        res2.show();
    }
}
