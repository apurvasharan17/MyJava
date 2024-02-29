package pattern2;

public class InvertedHalfPyramid { 
    public static void invertedHalfPyramid(int n,int m){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramid(4,4);
    }
}
