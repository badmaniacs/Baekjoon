package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            try {
                String[] data = br.readLine().split("");
                Stack<String> st = new Stack<String>();
                if (data[0].equals(".")) {
                    break;
                }
                for (int i=0;i<data.length;i++) {
                    if(data[i].equals("(")) {
                        st.push("(");
                    }
                    else if (data[i].equals("[")) {
                        st.push("[");
                    }
                    else if (data[i].equals(")")) {
                        if (st.pop().equals("[")) {
                            throw new Exception();
                        }
                    }
                    else if (data[i].equals("]")) {
                        if(st.pop().equals("(")) {
                            throw new Exception();
                        }
                    }
                }
                if (st.size()==0) {
                    bw.write("yes");
                    bw.newLine();
                }
                else {
                    bw.write("no");
                    bw.newLine();
                }
                st.clear();
            }
            catch (Exception e) {
                bw.write("no");
                bw.newLine();
            }    
        }
        bw.flush();
        bw.close();
    }    
}
