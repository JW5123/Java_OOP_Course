package Java14.Class09;

import java.io.*;

public class Class09 {
    public static void main(String[] args) throws IOException{
        FileReader fr1 = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class09/aaa.txt");
        FileReader fr2 = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class09/bbb.txt");
        FileReader fr3 = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class09/ccc.txt");

        BufferedReader br1 = new BufferedReader(fr1);
        BufferedReader br2 = new BufferedReader(fr2);
        BufferedReader br3 = new BufferedReader(fr3);

        String str;
        System.out.println("aaa.txt");
        while((str = br1.readLine()) != null)
            System.out.println(str);
        System.out.println("bbb.txt");
        while((str = br2.readLine()) != null)
            System.out.println(str);
        System.out.println("ccc.txt");
        while((str = br3.readLine()) != null)
            System.out.println(str);

        fr1.close();
        fr2.close();
        fr3.close();
    }
}
