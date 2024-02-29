package Recursion;
//Print n numbers in increasing order
public class Prblm2 {
    public static void increasing(int n ){
        if(n==0){
            return;
        }
        else{
            increasing(n-1);
            System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        increasing(10);
    }
}
