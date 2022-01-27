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
        result =  (w-x > x ? x : w-x) > ( h-y > y ? y : h - y ) ? ( h-y > y ? y : h - y ) : (w-x > x ? x : w-x) ; 
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }    
}
