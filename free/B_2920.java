package baekjoon.free;
import java.io.*;

public class B_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        String result = "";
        int count = 0;
        for (int i=0;i<data.length-1;i++) {
            if (Integer.parseInt(data[i])+1==Integer.parseInt(data[i+1])) {
                count++;
            }
            else if (Integer.parseInt(data[i])-1==Integer.parseInt(data[i+1])) {
                count--;
            }
        }
        if (count==7) {
            result = "ascending";
        } else if (count==-7) {
            result = "descending";
        } else result = "mixed";
        bw.write(result);
        bw.flush();
        bw.close();
    }    
}

