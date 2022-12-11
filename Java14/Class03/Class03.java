package Java14.Class03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Class03 {
    public static void main(String[] args) throws IOException{
        int n, sum = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入一個整數:");
        String str = bf.readLine();
        n = Integer.parseInt(str);

        for(int i = 0; i <= n; i++)
            sum += i;
        System.out.printf("1+2+...+%d = %d\n", n, sum);
    }
}
