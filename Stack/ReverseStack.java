package Stack;
import java.util.*;


public class ReverseStack {

    public static void reverseStack(Stack<Integer> s){
       if(s.isEmpty()){
        return;
       } 

       //kaam
       int top=s.pop();
       reverseStack(s);
       s.push(top);
       System.out.println(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3); 
        reverseStack(s);

        while(!s.isEmpty()){
            int top=s.pop();
            System.out.println(top);
            System.out.println("------");

        }
        
    }
}
