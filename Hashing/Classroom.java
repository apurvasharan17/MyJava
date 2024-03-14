package Hashing;
import java.util.*;
public class Classroom {
    
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);//Unordered data(randomly arranged)

        //Get -O(1)
        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("indonesia"));

        //containsKey-O(1)
        System.out.println(hm.containsKey("India"));

        //Remove-O(1)
        hm.remove("China");
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //isEmpty
        hm.clear(); //clear the map
        System.out.println(hm.isEmpty());

        // HashMap<String,Integer> hm=new HashMap<>();
        // hm.put("India",100);
        // hm.put("China",150);
        // hm.put("US",50);
        // hm.put("Indonesia",6);
        // hm.put("Nepal",5);

        // //Iterate
        
        // Set<String> keys=hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("key="+k+" value="+hm.get(k));
            
        // }
        // //hm.entrySet():- gives key value pair
        // System.out.println(hm.entrySet());
    }
}
