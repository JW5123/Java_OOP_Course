package Java14.Class06;

import java.io.*;;

public class Class06 {
    public static void main(String[] args) {
        try{
            char data[] = new char[128];
            FileReader fr = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class06/train.txt");

            int num = fr.read(data);
            String str = new String(data, 0, num);
            System.out.println("character count:" + num);
            System.out.println(str);
            fr.close();
        }
        catch(IOException e){

        }
    }
}
