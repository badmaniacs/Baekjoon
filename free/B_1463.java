package baekjoon.free;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        while(X!=1){
            if(X%3==0){
                X /= 3;
                count++;
            }
            else if(X%2==0){
                X /= 2;
                count++;
            }
            else{
                X--;
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        
    }    
}
