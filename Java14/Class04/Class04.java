package Java14.Class04;

import java.io.*;

public class Class04 {
    public static void main(String[] args) throws IOException {
        char data[] = new char[128];
        FileReader fr = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class04/donkey.txt");

        int num = fr.read(data);
        String str = new String(data, 0, num);
        System.out.println("character count:" + num);
        System.out.println(str);
        fr.close();
    }
}
//(b) 因為在Windows裡會將/r/n看成是兩個字符，所以也會被算進字元數裡

/*
Windows 每行結尾是以/r/n作為換行符
Mac/Unix 每行結尾只有以/n作為換行符
由於是使用MacOX做編寫所以只有28個字符
*/