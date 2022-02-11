package baekjoon.free;

import java.io.*;

public class B_15829 { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        char[] data = br.readLine().toCharArray();
        int sum = 0;
        for (int i=0; i<L; i++) {
            sum += ((int)data[i]-96)*Math.pow(31,i);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }   
}
