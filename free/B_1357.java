package baekjoon.free;
import java.io.*;

public class B_1357 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int result = Rev(Rev(Integer.parseInt(data[0])) + Rev(Integer.parseInt(data[1])));
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }

    public static int Rev(int x) {
        String s = Integer.toString(x);
        String[] d = s.split("");
        String result = "";
        for (int i =0;i<d.length;i++) {
            result += d[d.length-1-i];
        }        
        return Integer.parseInt(result);
    }    
}
