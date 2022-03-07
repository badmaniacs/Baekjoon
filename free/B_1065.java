package baekjoon.free;

import java.io.*;

public class B_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=1;i<=N;i++){
            if(HanSoo(i)) count++;
        }
        bw.write(String.format("%d", count));
        bw.flush();
    }
    static boolean HanSoo(int n){
        if(n<100 && n>0){
            return true;
        }
        else{         
            if(n/100 - (n%100)/10 == (n%100)/10 - n%10){
                return true;
            }
            return false;
        }        
    }
}
