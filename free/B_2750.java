package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list1 = new ArrayList<Integer>(N);
        for (int i = 0;i<N;i++) {
            int t = Integer.parseInt(br.readLine());
            list1.add(new Integer(t));
        }
        Collections.sort(list1);
        for (int j = 0; j<list1.size(); j++) {
            bw.write(Integer.toString(list1.get(j)));
            bw.newLine();
        }
        bw.flush();
        bw.close();            
    }    
}
