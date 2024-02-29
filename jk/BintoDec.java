import java.util.*;
public class BintoDec {
    public static int BinarytoDecimal(int bin)
    {
        int power=0;
        int dec=0;
        while(bin>0){
            int lastdigit=bin%10;
            dec=dec+(lastdigit*(int)(Math.pow(2,power)));
            power++;
            bin=bin/10;
        }
        return dec;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the binary number: ");
      int bin=sc.nextInt();
      int dec=BinarytoDecimal(bin);
      System.out.println("the decimal number is "+dec);
      sc.close();
    }
}
