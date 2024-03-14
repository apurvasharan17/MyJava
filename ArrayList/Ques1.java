package ArrayList;
import java.util.*;

public class Ques1 {
    public static boolean monotone(ArrayList<Integer> arr){

        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        // arr.add(2);
        arr.add(3);
        arr.add(2);
       System.out.println(monotone(arr));

    }
}
