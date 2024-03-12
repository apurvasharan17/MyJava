package PriorityQueues;
import java.util.*;
public class Start{
   static class Student implements Comparable<Student>{
      String name;
      int rank;

      public Student(String name,int rank){
        this.name=name;
        this.rank=rank;
      }
      @Override
      public int compareTo(Student s2){
        return this.rank-s2.rank;
      }
   }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//descending order
        // PriorityQueue<Integer> pq=new PriorityQueue<>();//for ascending order
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",4)); //Ologn
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            // System.out.println(pq.peek()); //o(1)
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();//Ologn
        }


    }
}