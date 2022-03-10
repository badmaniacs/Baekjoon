package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Student> tree = new TreeSet<>();
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            String[] data = br.readLine().split(" ");
            tree.add(new Student(data[0], Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3])));
        }
        Iterator<Student> it = tree.iterator();
        while(it.hasNext()){            
            bw.write(String.format("%s%n", it.next().name));
        }
        bw.flush();
        bw.close();
    }  
}
 
class Student implements Comparable<Student>{
    String name;
    int korean;
    int english;
    int math;

    Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }   
    public int compareTo(Student s){
        if (this.korean == s.korean) {
            if(this.english == s.english) {
                if(this.math == s.math){
                    return this.name.compareTo(s.name);
                }
                return -(this.math - s.math);
            }            
            return this.english - s.english;
        }
        return -(this.korean - s.korean);
    }
}