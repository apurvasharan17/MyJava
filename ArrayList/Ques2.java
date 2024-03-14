package ArrayList;
import java.util.*;
public class Ques2 {
    

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(6);
        arr.add(5);
        arr.add(8);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;i<arr.size();i++){
                if(arr.get(i)==arr.get(j)|| arr.get(j)==arr.get(i)-1||arr.get(j)==arr.get(i)+1){
                    continue;
                }else{
                    res.add(arr.get(i));
                }
            }
        }
        System.out.println(res);
    }
}
