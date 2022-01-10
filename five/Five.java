package baekjoon.five;
import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 0;
        N = Integer.parseInt(br.readLine());
        String[] score = new String[N];
        Double[] nscore = new Double[N];
        String data = br.readLine();
        score = data.split(" ");
        double sum = 0;
        double avg = 0;
        double M = 0;
        for (int i=0; i<N; i++) {
            if (Integer.parseInt(score[i])>M) {
                M = Integer.parseInt(score[i]);
            }
        }
        for (int j=0; j<N; j++) {
            nscore[j] = Double.parseDouble(score[j])/M*100;
            sum = sum + nscore[j];
        }
        avg = sum / N;
        bw.write(Double.toString(avg));
        bw.flush();
        bw.close();
    }    
}
