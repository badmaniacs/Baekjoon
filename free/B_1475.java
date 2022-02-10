package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] result = new int[9];
        String[] data = br.readLine().split("");
        for(String i : data) {
            if(i.equals("6")||i.equals("9")){
                result[6]++;
            }
            else {
                result[Integer.parseInt(i)]++;
            }
        }
        result[6] = result[6]%2 == 0 ? result[6]/2 : (result[6]/2)+1;
        Arrays.sort(result);
        bw.write(Integer.toString(result[8]));
        bw.flush();
        bw.close();
    }    
}
