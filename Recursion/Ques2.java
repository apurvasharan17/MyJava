package Recursion;

public class Ques2 {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void numbertostring(int n){
        if(n==0){
            return;
        }
        int lastDigit=n%10;
        numbertostring(n/10);
        System.out.print(digits[lastDigit]+" ");



    }
    public static void main(String[] args) {
        int n=2019;
        numbertostring(n);
        System.out.println();
    }
}
