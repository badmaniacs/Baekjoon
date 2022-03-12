package baekjoon.free;

import java.io.*;

public class B_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int number = 0;
        for (int i=0;i<N;i++){
            number += isPrimeNumber(Integer.parseInt(data[i]));
        }
        bw.write(Integer.toString(number));
        bw.flush();
    }
    static int isPrimeNumber(int x){
        if (x==1){
            return 0;
        }
        for (int i=2;i<x;i++){
            if(x % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
