package baekjoon.free;

import java.io.*;

public class B_3036 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int x = Integer.parseInt(data[0]);
        for(int i=1;i<N;i++){
            int y = Integer.parseInt(data[i]);
            int g = GCD(x, y);
            bw.write(String.format("%d/%d%n", x/g,y/g));
        }
        bw.flush();
        bw.close();     
    }
    static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        else{
            return GCD(y, x%y);
        }
    }
}