package baekjoon.free;
import java.io.*;

public class B_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] x = br.readLine().toUpperCase().split("");
        int[] arr = new int[200];
        int max = -1;
        int maxnumber = 0;
        boolean overlap = false;
        for (int i=0;i<x.length;i++) {
            char n = x[i].charAt(0);
            arr[(int)n]++;
        }
        for (int j=65;j<123;j++) {
            if (arr[j]>max) {
                max = arr[j];
                maxnumber = j;
                overlap = false;
            }
            else if (arr[j]==max) {
                overlap = true;
            }
        }
        if (overlap) {
            bw.write("?");
        }
        else {
            bw.write(String.valueOf((char)maxnumber));
        }
        bw.flush();
        bw.close();       
    }    
}
