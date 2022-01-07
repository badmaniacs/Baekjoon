package baekjoon.four;
import java.io.*;

public class one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String data = br.readLine();
        String arr[] = data.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);        
        while (a != 0 && b != 0) {            
            bw.write(Integer.toString(a+b)+"\n");
            bw.flush();
            data = br.readLine();
            arr = data.split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
        }
        bw.close();        
    }
}
