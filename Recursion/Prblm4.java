package Recursion;
//Print sum of first n natural numbers;
public class Prblm4 {

    public static int sum(int n){
        int sum;
        if(n==1){
            return 1;
        }
        else{
            sum= n + sum(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
