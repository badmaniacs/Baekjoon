package baekjoon.free;
import java.io.*;

public class B_1312 {
    public static void main(String[] args) throws IOException{
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        double d =( Double.parseDouble(data[0]) / Integer.parseInt(data[1]) ) - (Integer.parseInt(data[0])/Integer.parseInt(data[1]));
        String dd = Double.toString(d);
        String[] data2 = dd.split("");
        bw.write(data2[Integer.parseInt(data[2])+1]);
        bw.flush();
        bw.close();
        }
        catch(Exception e) {
            System.out.println("0");
        }
    }

    
}
