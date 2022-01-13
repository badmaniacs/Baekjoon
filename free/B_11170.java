package baekjoon.free;
import java.io.*;

public class B_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String sum = "";
        int count = 0;
        if (T>=1 && T<=20) {
            for (int k = 0; k < T; k++) {
            String arr[] = br.readLine().split(" ");
            for (int i = Integer.parseInt(arr[0]); i< Integer.parseInt(arr[1])+1; i++) {
                sum = sum + Integer.toString(i);
            }       
        String ss[] = sum.split("");
        for (int j=0; j<ss.length;j++) {
            if (ss[j].equals("0")) {
                count++;
            }
        }
        bw.write(Integer.toString(count)+"\n");
        count = 0;
        sum = "";
     }
        bw.flush();
        bw.close();

    }
    
}
}