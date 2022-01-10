package baekjoon.five;
import java.io.*;
import java.text.*;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.000");


        int N = Integer.parseInt(br.readLine());
        int P = 0;
        int sum = 0;
        double avg = 0.000;
        double avgp = 0.000;
        for (int i = 0; i<N; i++) {
            String[] c = br.readLine().split(" ");
            for (int j = 1; j<=Integer.parseInt(c[0]); j++) {
                sum = sum + Integer.parseInt(c[j]);


            }
            avg = Double.parseDouble(String.format( "%.3f", sum / Double.parseDouble(c[0]) ));
            sum = 0;
            for (int k = 1; k<=Integer.parseInt(c[0]); k++) {
                if (Integer.parseInt(c[k]) > avg ) {
                    P++;
                }

            }
            
            avgp = Double.parseDouble(String.format( "%.003f", (P / Double.parseDouble(c[0])) * 100 ));
            bw.write(df.format(avgp)+"%"+"\n");
            P = 0;
        }
        bw.flush();
        bw.close();

    }
    
}
