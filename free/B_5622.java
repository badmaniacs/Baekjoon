package baekjoon.free;
import java.io.*;

public class B_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   
        String data = br.readLine();
        char[] data2 = data.toCharArray();     
        int sum = 0;
        for (int i=0;i<data2.length;i++) {
            System.out.println((int)data2[i]);
            sum = sum + ( ((int)data2[i] - 59) / 2);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
    
}
