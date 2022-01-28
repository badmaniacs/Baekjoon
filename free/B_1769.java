package baekjoon.free;
import java.io.*;

public class B_1769 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;
    public static void main(String[] args)throws IOException {
        String X = br.readLine();
        prob(X);
        bw.flush();
        bw.close();
        
    }
    public static void prob(String X) throws IOException {
        String[] data = X.split("");
        int sum = 0;
        if (data.length<2) {
            sum = Integer.parseInt(X);
        } 
        else {
            count++;
            for (int i=0;i<data.length;i++) {
                sum += Integer.parseInt(data[i]); 
            }
        }
        if (sum>9) {
            prob(Integer.toString(sum));
        }
        else {
            if (sum%3==0 && sum>2) {
                bw.write(Integer.toString(count));
                bw.newLine();
                bw.write("YES");
            }
            else {
                bw.write(Integer.toString(count));
                bw.newLine();
                bw.write("NO");
            }
        }
    }  
}
