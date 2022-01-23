package baekjoon.free;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class B_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] N = br.readLine().split("");
        ArrayList<Integer> list1 = new ArrayList<Integer>(N.length);
        for (int i = 0;i<N.length;i++) {
            list1.add(Integer.parseInt(N[i]));
        }
        Collections.sort(list1);
        for (int j = N.length-1; j>=0; j--) {
            bw.write(Integer.toString(list1.get(j)));
        }
        bw.flush();
        bw.close();        
    }
    
}
