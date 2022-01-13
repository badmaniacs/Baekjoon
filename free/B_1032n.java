package baekjoon.free;
import java.io.*;

public class B_1032n {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); 
        String[] data = br.readLine().split("");
        String[] gene = data;
        int count = 1;
        while (count != N) {
            count++;
            data = br.readLine().split("");
            for (int i=0; i<data.length; i++) {
                if (data[i].equals(gene[i])) {
                    gene[i] = data[i];
                }
                else {
                    gene[i] = "?";
                }

            }
        }
        for (int j=0;j<gene.length;j++) {
            bw.write(gene[j]);
        }        
        bw.flush();
        bw.close();   
    }
}