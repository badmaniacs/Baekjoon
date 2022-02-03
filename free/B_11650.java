package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<point> list1 = new ArrayList<point>(N);
        for (int i=0;i<N;i++) {
            String[] data = br.readLine().split(" ");
            list1.add(new point(Integer.parseInt(data[0]),Integer.parseInt(data[1])));
        }
        Collections.sort(list1);
        for (point item : list1) {
            bw.write(String.format("%d %d%n", item.x,item.y));
        }
        bw.flush();
        bw.close();       
    }    
}
class point implements Comparable<point> {
    int x;
    int y;

    point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(point p) {
        return this.x==p.x ? this.y-p.y : this.x-p.x;
    }
}