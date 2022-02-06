package baekjoon.free;
import java.io.*;
import java.util.Stack;

public class B_1874  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int count = 1;
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();
        try {
            for (int i=0; i<n; i++) {
                int t = Integer.parseInt(br.readLine());
                MyPop(t, st);
            }
        }
        catch (Exception e) {
            sb.setLength(0);
            sb.append("NO");
        }
        System.out.println(sb);
    }
    static void MyPop (int t,Stack<Integer> st) throws Exception {
        
        if (t>=count) {
            st.push(count);
            count++;
            sb.append(String.format("+%n"));
            MyPop(t, st);
        }
        else if (t<st.peek() && st.contains(t)) {
            st.pop();
            sb.append(String.format("-%n"));
            MyPop(t, st);
        }
        else if (t==st.peek()) {
            sb.append(String.format("-%n"));
            st.pop();                 
        }
    }    
}
