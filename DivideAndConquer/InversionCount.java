package DivideAndConquer;

public class InversionCount {
    static int count=0;
    
    public static void inversions(int arr[],int k){

        //BASE CASE
        if(k==arr.length){
            System.out.println(count);

            return;
        }
        //kaam
        for(int i=0;i<arr.length;i++){
            if(arr[k]>arr[i] && k<i){
                count++;
                System.out.println("("+arr[k]+","+arr[i]+")");
                

            }
        }
        k++;
        inversions(arr,k);

    }



    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        inversions(arr,0);
    }
}
