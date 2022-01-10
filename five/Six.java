package baekjoon.five;
import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        for (int i=0; i<N; i++) {
            String[] oxArr = br.readLine().split("");
            for (int j=0; j<oxArr.length; j++) {
                if (oxArr[j].equals("O")) {
                    count++;
                    sum = sum + count;                
                }
                else if (oxArr[j].equals("X")) {
                    count = 0;
                }
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
            count = 0;
            sum = 0;
        }
        bw.flush();
        bw.close();             
    }  
}
