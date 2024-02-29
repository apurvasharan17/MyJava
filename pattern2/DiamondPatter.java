package pattern2;

public class DiamondPatter {
    public static void diamondpattern(int n){
        //first half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
                     //spaces
                     for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    //stars
                    for(int j=1;j<=(i*2)-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondpattern(4);
    }
}
