package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_2776{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i=0;i<T;i++){
            Integer.parseInt(br.readLine());
            String[] data1 = br.readLine().split(" ");
            for(String a : data1){
                tree.add(Integer.parseInt(a));
            }
            Integer.parseInt(br.readLine());
            String[] data2 = br.readLine().split(" ");
            for(String b : data2){
                if( tree.contains(Integer.parseInt(b))){
                    bw.write("1\n");
                }
                else{
                    bw.write("0\n");
                }
            }
            tree.clear();
        }
        bw.flush();
        bw.close();
    }
}