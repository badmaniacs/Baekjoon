package baekjoon.free;
import java.io.*;

public class B_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int C = 0;
        int Con = 0;
        for(int i=0;i<N;i++){
            String[] data = Integer.toString(i).split("");
            C = i;
            for(int j=0;j<data.length;j++){
                C += Integer.parseInt(data[j]);
            }
            if(C==N){
                Con = i;
                break;     
            }
        }
        bw.write(Integer.toString(Con));  
        bw.flush();
    }
}
