package Sorting;

public class SelectionSort {
    public static void selectionsort(int n[]){
        for(int i=0;i<n.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<n.length;j++){
                if(n[minPos]>n[j]){
                    minPos=j;
                }
            }
            int temp=n[minPos];
            n[minPos]=n[i];
            n[i]=temp;
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args) {
        int n[]={3,4,2,5,1};
        selectionsort(n);
    }
}
