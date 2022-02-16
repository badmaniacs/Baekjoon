package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i=0;i<N;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            bw.write(String.format("%d%n", it.previous())); 
        }              
        bw.flush();
        bw.close();        
    }    
}
