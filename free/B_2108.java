package baekjoon.free;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> data = new ArrayList<Integer>(N);
        for (int i=0;i<N;i++) {
            int s = Integer.parseInt(br.readLine());
            data.add(s); 
            sum += s;   
        }
        Collections.sort(data);
        int[] count = new int[data.get(N-1)];       
        for (int i=0;i<data.size();i++) {
            count[data.get(i)]++;            
        }
        bw.write(Integer.toString(sum/N));
        bw.write(Integer.toString(data.get(data.size()/2)));
        bw.write(Integer.toString(data.get(N-1)-data.get(0)));       
    }
    
}
