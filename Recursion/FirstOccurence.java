package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOccurence(arr, i+1,key);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,5};
        System.out.println(firstOccurence(arr,0,5));
    }
}
