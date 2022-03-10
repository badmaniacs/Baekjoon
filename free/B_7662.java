package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++){
            int k = Integer.parseInt(br.readLine());
            for (int j=0;j<k;j++){
                String[] input = br.readLine().split(" ");
                if(input[0].equals("D") && input[1].equals("-1")){
                    pq.notify();
                }
                if(input[0].equals("I")){

                }
            }
        }

    }
    
}
