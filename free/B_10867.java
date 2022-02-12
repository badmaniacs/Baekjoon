package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> tree = new TreeSet<>();
        String[] data = br.readLine().split(" ");
        for (int i=0;i<N;i++) {
            tree.add(Integer.parseInt(data[i]));
        }
        Iterator<Integer> it = tree.iterator();
        while(it.hasNext()){
            bw.write(String.format("%d ", it.next()));
        }
        bw.flush();
        bw.close();
    } 
}
