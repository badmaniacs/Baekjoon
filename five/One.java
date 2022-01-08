package baekjoon.five;
import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String data = br.readLine();
        String arr[] = data.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        int temp = Integer.parseInt(arr[0]);
        int temp2 = Integer.parseInt(arr[0]);
        for (int i = 0; i<N-1; i++) {
            int x = Integer.parseInt(arr[i]);
            int y = Integer.parseInt(arr[i+1]);
            temp = x > y ? x : y;
            temp2 = x < y ? x : y;
            max = max > temp ? max : temp;
            min = min < temp2 ? min : temp2;
        }        
        bw.write(Integer.toString(min)+" "+Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
