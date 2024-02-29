package pattern2;

public class HalfPyramidwithNumbers {
    public static void invertedPyramidNum(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            // //spaces
            // for(int j=1;j<=i-1;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedPyramidNum(5);
    }
}
