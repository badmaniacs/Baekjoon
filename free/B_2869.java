package baekjoon.free;
import java.io.*;
//달팽이
// 거리 V에 도달해야 하는데 낮에는 A만큼 올라가고 밤에는 B만큼 떨어진다 
// 결과값으로 소요일 반환 
public class B_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int V = Integer.parseInt(data[2]);
        int S = A - B;
        long D = 0;
        if (V % S != 0) {
            D = V / S + 1;
        }
        else D = V / S;
        bw.write(Long.toString(D));
        bw.flush();
        bw.close();     
        }               
    }
    