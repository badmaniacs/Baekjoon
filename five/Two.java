package baekjoon.five;

import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = 0;
        int maxcount = 0;
        for (int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                maxcount = i+1;
            }

        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(maxcount));
        bw.flush();
        bw.close();
    }
}
    

