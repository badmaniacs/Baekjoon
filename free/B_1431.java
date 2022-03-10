package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_1431{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> tree = new TreeSet<String>(new Comparator<String>() {
            public int compare(String a,String b){
                if(a.length()==b.length()){
                    String[] anum = a.replaceAll("[^0-9]", "0").split("");
                    String[] bnum = b.replaceAll("[^0-9]", "0").split("");
                    int asum=0;
                    int bsum=0;
                    for (int i=0;i<anum.length;i++){
                        asum+= Integer.parseInt(anum[i]);
                    }
                    for (int i=0;i<bnum.length;i++){
                        bsum+= Integer.parseInt(bnum[i]);
                        
                    }
                    if(asum==bsum){
                            return a.compareTo(b);
                        }
                    return asum-bsum;
                }
                return a.length()-b.length();
            }
        });
        for (int i=0;i<N;i++){
            tree.add(br.readLine());
        }
        Iterator<String> it = tree.iterator();
        while(it.hasNext()){
            bw.write(String.format("%s%n", it.next()));
        }
        bw.flush();
        bw.close();
    }
}