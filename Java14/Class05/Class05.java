package Java14.Class05;

import java.io.*;

public class Class05 {
    public static void main(String[] args) throws IOException{
        char data[] = new char[128];
        FileReader fr = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class05/donkey.txt");
        fr.skip(9);
        int num = fr.read(data);
        String str = new String(data, 0, num);
        System.out.println("character count:" + num);
        System.out.println(str);
        fr.close();
    }
}
