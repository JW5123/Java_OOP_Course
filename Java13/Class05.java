package Java13;

public class Class05 {
    public static void main(String[] args) {
        try{
            int num = 12;
            int den[] = {12, 0, 3, 0, 0, 4};
            for(int i = 0; i < 10; i++)
                System.out.println("ans = " + num / den[i]);
        }
        catch(ArithmeticException e){
            System.out.println("除數為 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("陣列注標超出範圍");
        }
    }
}
