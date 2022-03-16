package baekjoon.free;

import java.io.*;

public class B_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String data = br.readLine();
            if(data.equals("END")){
                break;
            }
            String[] ar = data.split("");
            String result = "";
            for (int i=0;i<ar.length;i++){
                result += ar[ar.length-1-i];
            }
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
    }
}
