package baekjoon.free;
import java.io.*;

public class B_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
        int N = Integer.parseInt(br.readLine());
        if (N==0) break;
        String[] data = Integer.toString(N).split("");
        String number = "";
        String result = "";
        for (int i = 1; i<data.length+1; i++) {
            number += data[data.length-i];            
        }
        if (N==Integer.parseInt(number)) {
            result = "yes";
        }
        else result = "no";
        bw.write(result);
        bw.newLine();
        bw.flush();           
    }
    bw.close();    
}
}