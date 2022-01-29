package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> que = new LinkedList<Integer>();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        ArrayList<Integer> result = new ArrayList<Integer>(N);
        for (int i=1 ; i<=N ; i++) {
            que.add(i);
        }
        while(que.peek()!=null) {
            for (int i=1; i<K ; i++) {
                que.add(que.poll());
            }
            result.add(que.poll());
        }
        if (result.size()==1) {
            bw.write("<1>");
        }
        else {
        bw.write("<"+result.get(0).toString()+", ");
        for (int i=1; i<result.size()-1; i++) {
            bw.write(result.get(i).toString()+", ");
        }
        bw.write(result.get(result.size()-1).toString()+">");
        }
        bw.flush();
        bw.close();
        
    }   
}
