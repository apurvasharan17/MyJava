package Array;

public class ques1 {

    public static boolean repeat(int num[]){

        for(int i=0;i<num.length;i++){
            int k=num[i];
            if(i==num.length-1){
                return false;
            }
            for(int j=i+1;j<num.length;j++){
                if(k==num[j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int num[]={1,2,3,5,6,7,4,4};
        System.out.println(repeat(num));

    }
}
