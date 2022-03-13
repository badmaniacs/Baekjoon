package baekjoon.free;

import java.io.*;

public class B_1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        boolean[] number = new boolean[N+1];
        for (int i=2;i<=Math.sqrt(N);i++){
            if(!number[i]){
                int j = 2;
                while(i*j<=N){
                    number[i*j]= true;
                    j++;
                }
            }
        }
        number[0] = true;
        number[1] = true;
        for (int i=M;i<number.length;i++){
            if(!number[i]){
                bw.write(String.format("%d%n", i));
            }
        }
        bw.flush();
        bw.close();
    }    
}
