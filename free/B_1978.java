package baekjoon.free;

import java.io.*;
import java.util.LinkedList;

public class B_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new BufferedWriter(new OutputStreamWriter(System.out));
        Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (String i : data) {
            list.add(Integer.parseInt(i));
        }
    }
}
