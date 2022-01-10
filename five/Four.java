package baekjoon.five;
import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        int[] remain = new int[42];
        int count2 = 0;
        while (count < 10) {
            remain[(Integer.parseInt(br.readLine()))%42]++;
            count++;
        }
        for (int i=0;i<remain.length;i++) {
            if (remain[i]!=0) {
                count2++;
            }
        }
        bw.write(Integer.toString(count2));
        bw.flush();
        bw.close();
    }
}
