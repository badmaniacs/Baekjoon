package baekjoon.free;
import java.io.*;

public class B_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for (int i= 0; i<T; i++) {
            String[] data = br.readLine().split(" ");
            String[] abc = data[1].split("");
            for (int j=0; j<abc.length; j++) {
                for (int k=0; k<Integer.parseInt(data[0]); k++) {
                    result += abc[j];
                }                
            }
        bw.write(result);
        bw.newLine();
        result = "";      
        }
        bw.flush();
        bw.close();
        
    }
}
