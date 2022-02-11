package baekjoon.free;

import java.io.*; 
import java.util.*;

public class B_17298{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList<Integer>(N);
        int max = 0;
        Stack<Integer> st = new Stack<Integer>();
        String[] data = br.readLine().split(" ");
        for (String i:data){
            st.push(Integer.parseInt(i));
        }
        int front = st.peek();
        for (int i=0;i<N;i++){     
            if(front>st.peek()){
                max = front;
                result.add(max);
            }
            else if(max>st.peek()){
                result.add(max);
            }
            else if(st.peek()>max){
                max = front;         
                result.add(-1);
            }
            front = st.pop();
        }
        Collections.reverse(result);
        for(int i : result){
            bw.write(String.format("%d ", i));
        }
        bw.flush();
        bw.close();     
    }
}