package baekjoon.free;

import java.io.*;

public class B_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] data = br.readLine().split(" ");
            int A = Integer.parseInt(data[0]);
            int B = Integer.parseInt(data[1]);
            if (A<B && B%A==0){
                bw.write("factor");
                bw.newLine();
            }
            else if (A>B && A%B==0){
                bw.write("multiple");
                bw.newLine();
            }
            else if (A==0 && B==0){
                break;
            }
            else{
                bw.write("neither");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }    
}
