package functions;

public class Palindrome {
    public static void PalindromeSeq(int n){
        int n1=n;
        int rem=0;
        int num=0;
        while(n>0){
            rem=n%10;
            num =rem + num*10;
            n=n/10;
        }
        if(n1==num)
        {
            System.out.println("it is a palindrome number");

        }else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeSeq(1232);
    }
}
