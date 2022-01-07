package baekjoon.three;
import java.io.*;

public class eight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i<t; i++) {
            String a = br.readLine();
            String arr[] = a.split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            String sum = Integer.toString(x+y);
            bw.write("Case #"+Integer.toString(i+1)+": "+arr[0]+" + "+arr[1]+" = " + sum);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
