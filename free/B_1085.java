package baekjoon.free;
import java.io.*;

public class B_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int x = Integer.parseInt(data[0]);
        int y = Integer.parseInt(data[1]);
        int w = Integer.parseInt(data[2]);
        int h = Integer.parseInt(data[3]);
        int result = 0;
        if (w-x<h-y) {
            result = w-x;
        }
        else result = h-y;
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }    
}
