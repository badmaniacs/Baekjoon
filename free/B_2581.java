package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = M ; i<=N;i++){
            if(isPrimeNumber(i)){
                List.add(i);
            }
        }
        if(List.size()==0){
            bw.write("-1");
        }
        else{
            Iterator<Integer> it = List.iterator();
            while(it.hasNext()){
                sum += it.next();
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
            bw.write(String.format("%d", Collections.min(List)));
        }
        bw.flush();
    }
    static boolean isPrimeNumber(int x){
        if(x == 1){
            return false;
        }
        for (int i=2; i<x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }  
}
