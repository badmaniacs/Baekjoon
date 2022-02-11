package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> tree = new TreeSet<String>(new comp());
        for (int i = 0;i<N;i++) {
            tree.add(br.readLine());
        }
        Iterator<String> iter = tree.iterator();
        while(iter.hasNext()) {
            bw.write(iter.next());
            bw.newLine();
        }
        bw.flush();
        bw.close();            
    }    
}
class comp implements Comparator<String> {
    public int compare(String x,String y) {
        if (x.length() == x.length()) {
            return x.compareTo(y);
        }
        else return x.length()-y.length();   
    }
}