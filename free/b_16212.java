package baekjoon.free;
import java.io.*;

public class b_16212 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer.parseInt(br.readLine());        
        String[] arr = br.readLine().split(" ");
        if (arr.length<=1000) {
        String temp = "";
        for (int i = 0; i<arr.length+1; i++) {
            for (int j = 0;j<arr.length-1; j++) {
                if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j+1])) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        for (int k = 0; k<arr.length; k++) {
            bw.write(arr[k]+" ");
        }
        bw.flush();
        bw.close();
    }
    else {
        throw new IllegalArgumentException();
    }
}
}
