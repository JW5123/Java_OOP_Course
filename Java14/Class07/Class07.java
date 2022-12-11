package Java14.Class07;

import java.io.*;

public class Class07 {
    public static void main(String[] args) throws IOException{
        int cnt = 0;
        String str;
        FileReader fr = new FileReader("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/Java14/Class05/donkey.txt");
        BufferedReader bf = new BufferedReader(fr);
        
        while((str = bf.readLine()) != null){
            if(cnt == 1)
                bf.skip(14);
            System.out.println(str);
            cnt++;
        }
        fr.close();
    }
}
