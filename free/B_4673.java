package baekjoon.free;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class B_4674 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] number = new boolean[10100];
        for (int i =0;i<10001;i++){
            number[Constructer(i)]=true;
        }
        for (int i=1;i<10001;i++){
            if (!number[i]){
                bw.write(String.format("%d%n", i));
            }
        }
        bw.flush();
        bw.close();    
    }
    static int Constructer(int n){
        String[] input = Integer.toString(n).split("");
        int sum = n;
        for(int i=0;i<input.length;i++){
            sum += Integer.parseInt(input[i]);
        }
        return sum;
    }
}
