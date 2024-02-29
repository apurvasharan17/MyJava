package Array;
// import java.util.*;
public class SubArrays {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        int max=Integer.MIN_VALUE;
        int ts=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]);
                    sum=sum+num[k];
                    System.out.print(",");
                }
                System.out.print(" sum= "+sum);
                if(sum>max){
                    max=sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of sub-array "+ts);
        System.out.println("maximum sub-array sum is "+max);
    }
}
