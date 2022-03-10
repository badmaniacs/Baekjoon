package baekjoon.free;

import java.io.*; 
import java.util.*;

public class B_17298{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        String[] data = br.readLine().split(" ");
        for (String i:data){
            st.push(Integer.parseInt(i));
        }
        for (int i=0;i<N;i++){
            if(st.peek()>st2.peek()){
                st2.push(st.pop());
                bw.write("-1");
                bw.newLine();
            }
            if(st.peek()<st2.peek()){
                st.pop();
            }    
        }
        bw.flush();
        bw.close();     
    }
}