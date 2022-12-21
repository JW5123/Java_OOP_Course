import java.io.*;

public class Class02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/renjiewang/Documents/GitHub/Java_OOP_Course/12_21_test/rand.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 1; i <= 1000; i++){
            bw.write(Integer.toString((int)(Math.random() * 100000)));
            bw.newLine();
        }
        bw.flush();
        fw.close();
    }
}
