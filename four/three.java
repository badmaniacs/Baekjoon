package baekjoon.four;
import java.io.*;

public class three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        int start = Integer.parseInt(number);
        int newnumber = -1;
        int count = 0;
        String zero = "0";
        while (start != newnumber) {
            if (Integer.parseInt(number)<10) {  
                number = zero + number;           
            }
            String arr[] = number.split("");
            int plusnumber = Integer.parseInt(arr[0]) + Integer.parseInt(arr[arr.length-1]);
            String splusnumber = Integer.toString(plusnumber);
            String arr2[] = splusnumber.split("");
            number = arr[arr.length-1] + arr2[arr2.length-1];
            newnumber = Integer.parseInt(number);
            count++;
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
