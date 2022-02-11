package baekjoon.free;
import java.io.*;
import java.util.*;

public class B_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); 
        Stack<Integer> st = new Stack<Integer>();
            for (int i = 0; i < N ; i++) {
                String[] data = br.readLine().split(" ");
                if (data[0].equals("push")) {
                    st.push(Integer.parseInt(data[1]));                   
                }
                else if (data[0].equals("pop")) {
                    try {
                    bw.write(Integer.toString(st.pop()));
                    bw.newLine();  
                    }
                    catch(Exception e) {
                        bw.write("-1");
                        bw.newLine();
                    }
                }
                else if (data[0].equals("size")) {
                    bw.write(Integer.toString(st.size()));
                    bw.newLine();
                }
                else if (data[0].equals("empty")) {
                    if (st.empty()) {
                        bw.write("1");
                        bw.newLine();
                    }
                    else {
                        bw.write("0");
                        bw.newLine();
                    }
                }
                else if (data[0].equals("top")) {
                    try {
                    bw.write(Integer.toString(st.peek()));
                    bw.newLine();
                    }
                    catch (Exception e)
                    {
                        bw.write("-1");
                        bw.newLine();
                    }
                }
            }
            bw.flush();
            bw.close();      
    }  
}
