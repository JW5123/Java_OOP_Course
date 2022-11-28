package Java13;

public class Class02 {
    public static void main(String[] args) {
        int num = 12, den = 0;
        int ans;
        if(den == 0)
            System.out.println("除數為 0");
        else{
            ans = num / den;
            System.out.println("ans = " + ans);
        }
        System.out.println("end of main() method");
    }
}
