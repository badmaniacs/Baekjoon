package baekjoon.free;
import java.io.*;

public class B_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int a = Integer.parseInt(data[0])*Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1])*Integer.parseInt(data[1]);
        int c = Integer.parseInt(data[2])*Integer.parseInt(data[2]);
        int d = Integer.parseInt(data[3])*Integer.parseInt(data[3]);
        int e = Integer.parseInt(data[4])*Integer.parseInt(data[4]);
        int r = (a+b+c+d+e)%10;
        bw.write(Integer.toString(r));
        bw.flush();
        bw.close();

        
    }
    
}
