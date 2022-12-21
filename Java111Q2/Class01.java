import java.util.*;

public class Class01 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("密碼輸入測試");
            System.out.print("請輸入密碼:");
            int n1 = sc.nextInt();
            int cnt = 0;
            while(true){
                System.out.print("請再輸入一次密碼:");
                int n2 = sc.nextInt();
                if(n1 == n2)
                    break;
                else
                    cnt++;
                if(cnt == 3)
                    throw new RuntimeException("輸入三次錯誤！程式停止！");
                else
                    System.out.println("與第一次輸入的不同!");
            }
            System.out.println("密碼正確");
        }
    }
}
