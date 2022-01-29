package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());        
        LinkedList<Integer> card = new LinkedList<Integer>();
        for (int i=1; i<=N; i++){
            card.add(i);
        }
        while(card.size()>1) {
            card.removeFirst();
            card.offerLast(card.pollFirst());
        }
        bw.write(Integer.toString(card.getFirst()));
        bw.flush();
        bw.close();       
    }
    
}
