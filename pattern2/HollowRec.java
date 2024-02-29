package pattern2;

public class HollowRec {
    public static void hollowRectangle(int n,int m){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner columns
            for(int j=1;j<=m;j++){
                //cell=(i,j)
                if(i==1 || i==n ||j==1||j==m){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(10,8);
    }
}
