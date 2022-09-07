import java.text.DecimalFormat;
class Cbbb{
    double x;
    double y;
}
public class Class02{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();
        obj1.x = 5.2; obj1.y = 3.9;
        obj2.x = 6.5; obj2.y = 4.6;
        avg.x = (obj1.x + obj2.x) / 2;
        avg.y = (obj1.y + obj2.y) / 2;
        System.out.printf("obj1.x = %s, obj1.y = %s\n", df.format(obj1.x), df.format(obj1.y));
        System.out.printf("obj2.x = %s, obj2.y = %s\n", df.format(obj2.x), df.format(obj2.y));
        System.out.printf("avg.x = %s, avg.y = %s\n", df.format(avg.x), df.format(avg.y));
    }
}