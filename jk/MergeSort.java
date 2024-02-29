public class MergeSort {

    public static void merge(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0; 

        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
    }
    public static void divide(int arr1[],int si,int ei){
        if(arr1.length==1)
        {return;}

        int mid=(si+ei)/2;
        divide(arr1,si,mid);
        divide(arr1,mid+1,ei);
        merge(arr1,si,mid,ei);

    }
    public static void main(String[] args) {
        int arr[]={3,4,1,8,2,9};
        int start=0;
        int end=arr.length-1;
        divide(arr,start,end);
    }
}
