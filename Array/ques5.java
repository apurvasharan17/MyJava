package Array;
import java.util.Arrays;
public class ques5 {

    public static void triplet(int num[]){
        int n[]=new int[3];
         for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){

                    if(i!=j && i!=k && j!=k && (num[i]+num[j]+num[k]==0)){
                        n[0]=num[i];
                        n[1]=num[j];
                        n[2]=num[k];
                        Arrays.sort(n);
                        
                        System.out.println("("+num[i]+","+num[j]+","+num[k]+")");
                    }
                }
            }
         }
    }
    public static void main(String[] args) {
        int num[]={-1,0,1,2,-1,4};
        triplet(num);

    }
}
