package baekjoon.free;
import java.io.*;

public class B_10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split("");
        int count = 0;
        for (int i=0;i<data.length;i++) {
            if (data[i].equals("a")) count++;
            else if (data[i].equals("e")) count++;
            else if (data[i].equals("i")) count++;
            else if (data[i].equals("u")) count++;
            else if (data[i].equals("o")) count++;
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }    
}
