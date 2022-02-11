package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] data2 = br.readLine().split(" ");
        int[] count = new int[M];
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        for (String i : data) {
            list.add(Integer.parseInt(i));
        }
        Collections.sort(list);
        for (int i = 0; i<M; i++) {
            count[i] = BynarySearch(list, Integer.parseInt(data2[i]));            
        }
        
    }
    static int BynarySearch (ArrayList<Integer> a, int key) {
        int left = 0;
        int right = a.size()-1;

        do {
            int center = (left+right)/2;
            if (a.get(center)==key) {
                return CheckFront(a,center,key);
            }
            else if(a.get(center)<key) {
                left = center+1;
            }
            else {
                right = center-1;
            }
        }
        while (left<=right);
        return 0;
    }
    static int CheckFront (ArrayList<Integer> a, int center,int key) {
        int point = center;

        do {
            if(a.get(point)==key) {
                point--;
            }
        }while(a.get(point)==key || point==1);
        return CountNumber(a, point, key);
    }
    static int CountNumber (ArrayList<Integer> a, int point,int key) {
        int count = 0;

        do {
            if(a.get(point)==key) {
                count++;
                point++;
            }
        }while(a.get(point)==key );
        return count;
    }
}
