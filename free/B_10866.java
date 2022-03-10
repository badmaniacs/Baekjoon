package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<Integer>(); 
        for (int i=0;i<N;i++){
            String[] order = br.readLine().split(" ");
            switch(order[0]){
                case "push_front":
                    deque.addFirst(Integer.parseInt(order[1]));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(order[1]));
                    break;  
                case "pop_front":
                    bw.write(String.format("%d%n", deque.peekFirst()==null ? -1 : deque.pollFirst()));
                    break;
                case "pop_back":
                    bw.write(String.format("%d%n", deque.peekLast()==null ? -1 : deque.pollLast())); 
                    break;
                case "size":
                    bw.write(String.format("%d%n", deque.size())); 
                    break;
                case "empty":
                    bw.write(String.format("%d%n", deque.size()==0 ? 1 : 0)); 
                    break;
                case "front":
                    bw.write(String.format("%d%n", deque.peekFirst()==null? -1 : deque.peekFirst())); 
                    break;
                case "back":
                    bw.write(String.format("%d%n", deque.peekLast()==null? -1 : deque.peekLast())); 
                    break;                 
            }
        }
        bw.flush();
        bw.close();         
    }
}
