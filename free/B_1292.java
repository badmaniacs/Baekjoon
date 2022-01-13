package baekjoon.free;
import java.io.*;


public class B_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int count = 0;
        int incount = 0;
        String arr = "";
        for (int i = 1; i<B+1; i++) {
            count++;             
                while(incount!=count) {
                    arr += Integer.toString(i);
                    incount++;
                }              
            incount = 0;
        }
        System.out.println(arr);
        bw.close();
    }


    
}
