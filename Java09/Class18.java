package Java09;

public class Class18 {
    public static void main(String[] args) {
        int inp = 1;
        (
            new CCircle(inp){
                public void show(){
                    System.out.println(radius * radius * pi);
                }
            }
        ).show();
    }
    static class CCircle{
        public double pi = 3.14;
        public double radius;

        public CCircle(double r){
            radius = r;
        }
    }
}
