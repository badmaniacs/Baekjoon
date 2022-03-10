package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<String> tree = new TreeSet<>();
        TreeSet<String> tree2 = new TreeSet<>();
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        for (int i=0;i<N;i++){
            tree.add(br.readLine());
        }
        for (int i=0;i<M;i++){
            String temp = br.readLine();
            if(tree.contains(temp)){
                tree2.add(temp);
            }
        }
        Iterator<String> it = tree2.iterator();
        bw.write(Integer.toString(tree2.size()));
        bw.newLine();
        while(it.hasNext()){
            bw.write(String.format("%s%n", it.next()));           
        }
        bw.flush();
        bw.close();
    }   
}
