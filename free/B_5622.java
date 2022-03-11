package baekjoon.free;
import java.io.*;

public class B_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   
        String[] data = br.readLine().split("");
        int sum = 0;
        for (int i=0;i<data.length;i++) {
            sum += dial(data[i]);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
    static int dial(String input){
        if(input.equals("A")||input.equals("B")||input.equals("C")){
            return 3;
        }
        else if(input.equals("D")||input.equals("E")||input.equals("F")){
            return 4;
        }
        else if(input.equals("G")||input.equals("H")||input.equals("I")){
            return 5;
        }
        else if(input.equals("J")||input.equals("K")||input.equals("L")){
            return 6;
        }
        else if(input.equals("M")||input.equals("N")||input.equals("O")){
            return 7;
        }
        else if(input.equals("P")||input.equals("Q")||input.equals("R")||input.equals("S")){
            return 8;
        }
        else if(input.equals("T")||input.equals("U")||input.equals("V")){
            return 9;
        }
        else{
            return 10;
        }
    }
    
}
