package baekjoon.three;
import java.io.*;

public class ten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String data = br.readLine();
        String arr[] = data.split(" ");
        int X = Integer.parseInt(arr[1]);
        data = br.readLine();
        String arr2[] = data.split(" ");
        for (int j=0; j<arr2.length; j++) {
            if (Integer.parseInt(arr2[j])<X) {
                bw.write(arr2[j]+" ");
            }
        }       
        bw.flush();
        bw.close();        
    }
}
