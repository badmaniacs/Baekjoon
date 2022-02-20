package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        HashMap<String,String> hmap = new HashMap<>(N);
        for (int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            hmap.put(input[0], input[1]);            
        }
        for (int i=0;i<M;i++){
            bw.write(hmap.get(br.readLine())+"\n");
        }
        bw.flush();
        bw.close();      
    }
    
}
