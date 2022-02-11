package baekjoon.free;
import java.io.*;

public class B_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        int front = 0;
        int back = 0;
        int size = 0;
        for (int i=0;i<N;i++){
            String[] data = br.readLine().split(" ");
            if(data[0].equals("push")){
                queue[back++] = Integer.parseInt(data[1]);
                size++;
                if(back>=N) {
                    back = 0;
                }
            }
            else if(data[0].equals("pop")){
                if(size==0) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                bw.write(Integer.toString(queue[front++]));
                bw.newLine();
                size--;
                if(front>=N) {
                    front = 0;
                }
            }
            }
            else if(data[0].equals("size")){
                bw.write(Integer.toString(size));
                bw.newLine();
            }
            else if(data[0].equals("empty")){
                if (size==0) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            }
            else if(data[0].equals("front")){
                if (size==0) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(queue[front]));
                    bw.newLine();
                }
            }
            else if(data[0].equals("back")){
                if (size==0) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(queue[back-1]));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }    
}
