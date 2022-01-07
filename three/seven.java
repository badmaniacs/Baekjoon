package baekjoon.three;
import java.io.*;

public class seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i<t; i++) {
            String a = br.readLine();
            String arr[] = a.split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            bw.write("Case #");
            bw.write(Integer.toString(i+1));
            bw.write(": ");
            bw.write(Integer.toString(x+y));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
