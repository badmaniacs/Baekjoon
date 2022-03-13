package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> PrimeNumber = new ArrayList<>(N);
        boolean[] isPrimeNumber = new boolean[N+1];
        for (int i = 2; i<=Math.sqrt(N);i++){
            if(!isPrimeNumber[i]){
                int j=2;
                while(i*j<=N){
                    isPrimeNumber[i*j]=true;
                    j++;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(!isPrimeNumber[i]){
                PrimeNumber.add(i);
            }
        }
        while(N!=1){
            for(int i=0;i<PrimeNumber.size();i++){
                int factor = PrimeNumber.get(i);
                if(N%factor==0){
                    N = N/factor;
                    bw.write(String.format("%d%n", factor));
                    break;
                }
            }
        }
        bw.flush();
    }
}
