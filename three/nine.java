package baekjoon.three;
import java.io.*;

public class nine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            for (int j=n-i ; j>0; j--) {
                bw.write(" ");
            }
            for (int o=1; o<=i; o++) {
                bw.write("*");
            }
            bw.write("\n");     
        }
        bw.flush();
        bw.close();        
    }    
}
