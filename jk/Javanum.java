// import java.util.*;
public class Javanum {
    public static void main(String args[])
    {
    //   Scanner sc=new Scanner(System.in);
    //   System.out.println("Enter the value of a");
    //   int a=sc.nextInt();
    //   System.out.println("Enter the value of b");
    //   int b=sc.nextInt();
    //   int sum=a+b;
    //   System.out.println("The value of sum is "+sum);
    int num=10899;
    while(num>0)
    {
        int lastdigit=num%10;
        System.out.print(lastdigit+"");
        num=num/10;

    }
    System.out.println();
    }
}
