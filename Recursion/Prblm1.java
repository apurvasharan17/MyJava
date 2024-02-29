package Recursion;
//print numbers from n to 1(Decreasing Order)
public class Prblm1 {
    public static void decreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);
    }
    public static void main(String[] args) {
        decreasing(10);
    }
}
