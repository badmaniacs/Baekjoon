package baekjoon.free;
import java.io.*;

public class B_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        try {
        if (data[0].equals("")) {
            bw.write(Integer.toString(data.length-1));
        }
        else {
            bw.write(Integer.toString(data.length));
        }

    }
    catch (Exception e) {
        bw.write("0");
    }
    bw.flush();
    bw.close();
    }    
}

