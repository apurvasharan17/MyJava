package Hashing;
import java.util.*;
public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
      
        set.remove(2);

        System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());


        HashSet<String> cities= new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        @SuppressWarnings("rawtypes") //for warning in Iterator
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());//updation nd print both happens
        }

        for(String city:cities){
            System.out.println(city);
        }


        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluruts");
        System.out.println(ts);


    }
    
}
