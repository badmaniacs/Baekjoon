package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<String> tree = new TreeSet<>();
        String data = br.readLine();
        for (int i=0;i<data.length();i++){
            tree.add(data.substring(i, data.length()));
        }
        Iterator<String> it = tree.iterator();
        while(it.hasNext()){
            bw.write(it.next());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }  
}
