package Java11;
interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public double calcu();
}
class CStu implements Data, Test{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public CStu(String s1, String s2, int m, int f, int c){
        id = s1;
        name = s2;
        mid = m;
        finl = f;
        common = c;
    }
    public double calcu(){
        return (mid * 0.3 + finl * 0.3 + common * 0.4);
    }
    public void showData(){
        System.out.println("學號: " + id);
        System.out.println("姓名: " + name);
    }
    public void showScore(){
        System.out.println("期中考成績: " + mid);
        System.out.println("期末考成績: " + finl);
        System.out.println("平時成績: " + common);
        System.out.println("學期成績: " + calcu());
    }
    public void show(){
        showData();
        showScore();
    }

}
public class Class11 {
    public static void main(String[] args) {
        CStu stu = new CStu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
