package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] data2 = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        for (String i : data) {
            list.add(Integer.parseInt(i));
        }
        Collections.sort(list);
        for (String i : data2) {
            bw.write(String.format("%d%n", BynarySearch(list, Integer.parseInt(i))));
        }
        bw.flush();
        bw.close();
    }    
    static int BynarySearch (ArrayList<Integer> a, int key) {
        int left = 0;
        int right = a.size()-1;
        do {
            int center = (left+right)/2;
            if (a.get(center)==key) {
                return 1;
            }
            else if(a.get(center)<key) {
                left = center+1;
            }
            else {
                right = center-1;
            }
        }
        while (left<=right);
        return 0;
    }
}
