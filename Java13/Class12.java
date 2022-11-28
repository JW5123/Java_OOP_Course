package Java13;

class NotTriangleException extends Exception{}
class EquilateralTriangle extends Exception{}
class NotEquilateralTriangle extends Exception{}
public class Class12 {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 5;
        try{
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
            triangle(a, b, c);
        }
        catch(NotTriangleException e){
            System.out.println("不構成三角形");
        }
        catch(EquilateralTriangle e){
            System.out.println("這是正三角形");
        }
        catch(NotEquilateralTriangle e){
            System.out.println("這不是正三角形");
        }
    }
    public static void triangle(int a, int b, int c) throws 
    NotTriangleException, EquilateralTriangle, NotEquilateralTriangle{
        if((a + b) < c || (a + c) < b || (b + c) < a)
            throw new NotTriangleException();
        else if(a == b && a == c && b == c)
            throw new EquilateralTriangle();
        else
            throw new NotEquilateralTriangle();
    }
}
