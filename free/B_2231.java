package baekjoon.free;
import java.io.*;

public class B_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i=0; i<N; i++) {
            String[] data = Integer.toString(i).split("");
            while (sum!=N) {
                sum = 0;
                sum = sum + i;
                for(int j=0; j<data.length; j++) {              
                    sum += Integer.parseInt(data[j]);    
            }
            System.out.println(sum);
            }
        }
    
    bw.write(Integer.toString(sum));
    bw.flush();
    bw.close();
        
    }
    
}
