package Java10;
class CShape{
    public double area(){
        return 0.0;
    }
}
class CCircle extends CShape{
    double radius;
    public CCircle(double r){
        radius = r;
    }
    public double area(){
        return 3.14 * radius *radius;
    }
}
class CSquare extends CShape{
    double side;
    public CSquare(double s){
        side = s;
    }
    public double area(){
        return side * side;
    }
}
class CTriangle extends CShape{
    double base, height;
    public CTriangle(double b, double h){
        base = b;
        height = h;
    }
    public double area(){
        return (base * height) / 2;
    }
}
public class Class11 {
    public static void main(String[] args) {
        CCircle cir1 = new CCircle(2);
        CCircle cir2 = new CCircle(3);
        CSquare squ1 = new CSquare(2);
        CSquare squ2 = new CSquare(3);
        CTriangle ctr1 = new CTriangle(3, 4);
        CTriangle ctr2 = new CTriangle(5, 6);

        System.out.printf("cir1 = %.1f\ncir2 = %.1f\n", cir1.area(), cir2.area());
        System.out.printf("squ1 = %.1f\nsqu2 = %.1f\n", squ1.area(), squ2.area());
        System.out.printf("ctr1 = %.1f\nctr2 = %.1f\n", ctr1.area(), ctr2.area());
        double arr[] = new double[6];
        arr[0] = cir1.area();
        arr[1] = cir2.area();
        arr[2] = squ1.area();
        arr[3] = squ2.area();
        arr[4] = ctr1.area();
        arr[5] = cir2.area();
        System.out.printf("largest = %.1f\n", largest(arr));
    }
    public static double largest(double arr[]){
        double max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
