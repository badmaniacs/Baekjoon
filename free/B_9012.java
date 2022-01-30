package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T ; i++ ) {
            try {
                String[] data = br.readLine().split("");
                Stack<String> st = new Stack<String>();
                for (int j = 0; j<data.length; j++ ) {
                    if(data[j].equals("(")) {
                        st.push("");
                    }
                    else if (data[j].equals(")")) {
                        st.pop();
                    }
                }
                if (st.size()==0) {
                    bw.write("YES");
                    bw.newLine();
                }
                else {
                    bw.write("NO");
                    bw.newLine();
                }
                st.clear();
            }
            catch (EmptyStackException e) {
                bw.write("NO");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();    
    }
}
    


