package Java13;

import java.io.*;

class  ArgumentOutOfBound extends Exception{}
public class Class15 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入大於 0 的整數:");
        String str = buf.readLine();
        int num = Integer.parseInt(str);
        mySqrt(num);
    }
    public static void mySqrt(int n){
        try{
            if(n < 0)
                throw new ArgumentOutOfBound();
            else
                System.out.printf("sqrt(%d) = %.1f\n", n, Math.sqrt(n));
        }
        catch(ArgumentOutOfBound e){
            System.out.println(n + "小於0");
        }
    }
}
