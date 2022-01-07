package baekjoon.four;
import java.io.*;

public class two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String data;
        String arr[];
        int a,b;
        try {     
        while ( (data = br.readLine()) != null ) {           
            arr = data.split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            bw.write(Integer.toString(a+b)+"\n");
            bw.flush();
        }
    }
        catch (Exception e) {

        }
        bw.close();        
    }
}