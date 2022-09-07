package Java08;
class CCircle{
    double area(double r){
        return r * r * 3.14;
    }
    float area(float r){
        return r * r * 3.14f;
    }
    double area(int r){
        return r * r * 3.14;
    }
}
public class Class13 {
    public static void main(String[] args) {
        CCircle obj = new CCircle();
        System.out.println("area(2) = " + obj.area(2));
        System.out.println("area(2.2f) = " + obj.area(2.2f));
        System.out.println("area(2.2) = " + obj.area(2.2));
    }
}
