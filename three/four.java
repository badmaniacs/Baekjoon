package baekjoon.three;
import java.io.*;

public class four {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        for (int i = 0; i<t; i++) {
            String a = br.readLine();
            String arr[] = a.split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            bw.write(Integer.toString(x+y));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
