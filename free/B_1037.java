package baekjoon.free;

import java.io.*;

public class B_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int max = Integer.parseInt(data[0]);
        int min = Integer.parseInt(data[0]);
        for (String i : data) {
            max = Integer.parseInt(i) > max ? Integer.parseInt(i) : max;
            min = Integer.parseInt(i) < min ? Integer.parseInt(i) : min;
        }
        bw.write(Integer.toString(min*max));
        bw.flush();
        bw.close();        
    }   
}
