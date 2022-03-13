package baekjoon.free;

import java.io.*;

public class B_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            int count = 0;
            int x = 2 * n;
            boolean[] isPrimeNumber = new boolean[x+1];
            for(int i=2;i<=Math.sqrt(x);i++){
                int j = 2;
                while(i*j<=(x)){
                    isPrimeNumber[i*j] = true;
                    j++;
                }
            }
            for(int i=n+1;i<=x;i++){
                if(!isPrimeNumber[i]){
                    count++;
                }
            }
            bw.append(count+"\n");
        }
        bw.flush();     
    }
}
