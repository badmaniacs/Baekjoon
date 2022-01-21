package baekjoon.free;
import java.io.*;

public class B_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] data = input.split("");
        String reverse = "";
        for (int i = 1; i<data.length+1; i++) {
            reverse += data[data.length-i];            
        }
        if (input.equals(reverse)) {
            bw.write("1");
        }
        else bw.write("0");
        bw.flush();
        bw.close();        
    }
    
}
