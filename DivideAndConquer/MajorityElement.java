package DivideAndConquer;

public class MajorityElement {
    public static void majorityElement(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
       int maj=Integer.MIN_VALUE;
       for(int i=0;i<count.length;i++){
        maj=Math.max(maj,count[i]);
       }
       if(maj>num.length/2){
        LinearSearch(count,maj);
       }

    }
 public static void LinearSearch(int count[],int maj){
    for(int i=0;i<count.length;i++){
        if(count[i]==maj){
            System.out.println(i);
        }
    }
 }   
    
    public static void main(String[] args) {
        int num[]={3,2,2,3};
        majorityElement(num);
    }
}
