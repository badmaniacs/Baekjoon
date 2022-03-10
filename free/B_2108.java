package baekjoon.free;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        ArrayList<Integer> data = new ArrayList<Integer>(5);
        for (int i=0;i<5;i++) {
            int s = Integer.parseInt(br.readLine());
            data.add(s);  
            sum += s;
        }
        bw.write(String.format("%d%n", sum/5));
        Collections.sort(data);
        bw.write(String.format("%d%n", data.get(3)));
        bw.flush();
    }    
}
