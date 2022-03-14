package baekjoon.free;

import java.io.*;

public class B_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");    
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int temp = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        String[] input2 = br.readLine().split(" ");
        boolean[] selected = new boolean[input2.length];
        int[] data = new int[input2.length];
        for (int i=0;i<input2.length;i++){
            data[i] = Integer.parseInt(input2[i]);
        }
        for (int i=0;i<data.length;i++){
            x = data[i];
            selected[i] = true;
            for (int j=0;j<data.length;j++){
                if(!selected[j]){
                    selected[j] = true;
                    y = data[j];
                    for(int k=0;k<data.length;k++){
                        if(!selected[k]){
                            z = data[k];
                            System.out.println(k);
                            if(x+y+z<=M){
                                if(x+y+z>temp){
                                    temp = x+y+z;
                                }
                            }
                        }
                    }
                    selected[j] = false;    
                }       
            }
            selected[i] = false;
        }
        System.out.println(temp);
    }    
}
