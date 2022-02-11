package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<data> l = new ArrayList<data>(N);
        for (int i=0;i<N;i++) {
            String[] input = br.readLine().split(" ");
            l.add(new data(Integer.parseInt(input[0]),input[1]));
        }
        Collections.sort(l);
        for ( data item : l) {
            bw.write(String.format("%d %s", item.age,item.name));    
            bw.newLine();      
        }
        bw.flush();
        bw.close();        
    }    
}

class data implements Comparable<data>{
    int age;
    String name;

    data(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public int compareTo(data d) {
        if (this.age > d.age) {
            return 1;
        }
        else if (this.age < d.age) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
