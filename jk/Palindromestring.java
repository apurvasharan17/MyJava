// import java.util.*;
public class Palindromestring {
    public static void main(String args[])
    {
        String name="racepar";
        for(int i=0;i<name.length()/2;i++)
        {   int n=name.length();
            if(name.charAt(i)!=name.charAt(n-1-i))
           { System.out.println("It is not a Palindrome");
            return;}   
        }
        System.out.println("It is Palindrome");
        
    }
}
