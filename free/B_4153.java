package baekjoon.free;
import java.io.*;

public class B_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        String temp = "";
        for (int i=0;i<2;i++) {
            if (Integer.parseInt(data[i])>Integer.parseInt(data[i+1])) {
                temp = data[i+1];
                data[i+1] = data[i];
                data[i] = temp;
            }
        }
        int x = Integer.parseInt(data[0]);
        int y = Integer.parseInt(data[1]);
        int z = Integer.parseInt(data[2]);
        String result = "";
        do {
            if (x*x+y*y==z*z) {
                result = "right";
            }
            else result = "wrong";
            bw.write(result);
            bw.newLine();
            bw.flush();
            data = br.readLine().split(" ");
            for (int i=0;i<2;i++) {
                if (Integer.parseInt(data[i])>Integer.parseInt(data[i+1])) {
                    temp = data[i+1];
                    data[i+1] = data[i];
                    data[i] = temp;
                }
            }    
            x = Integer.parseInt(data[0]);
            y = Integer.parseInt(data[1]);
            z = Integer.parseInt(data[2]);
            result = "";
        }  
        while (x+y+z!=0);  
        bw.close();
    }   
}
