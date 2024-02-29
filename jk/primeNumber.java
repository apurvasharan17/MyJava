// import java.util.*;
// public class primeNumber {
//     public static void main(String args[]){
//         boolean flag=true;
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num=sc.nextInt();
//         for(int i=2;i<=num-1;i++)
//         {
//             if(num%i==0)
//             {
//                 flag=false;
//             }
//         }
//         if(flag==false)
//         System.out.println("Not a Prime Number");
//         else
//         System.out.println("Prime Number");

        
//     }
// }
import java.util.*;

public class primeNumber{

    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void primeinRange(int n)
    {
        for(int i=2;i<=n;i++){
            if(isPrime(i))
            System.out.print(i+",");
        }
        System.out.println();
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n=sc.nextInt();
        primeinRange(n);
        sc.close();

    }
}
