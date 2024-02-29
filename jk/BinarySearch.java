public class BinarySearch {
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10,12};
        int key=1;
        int start=0,end=numbers.length-1;
        
        while(start<=end)
        {   int mid=(start+end)/2;
            if (numbers[mid]==key)
            {
                System.out.println("Key found at index :"+mid);
                return;
            
            }
            else if(numbers[mid]>key)
            {
                end=mid-1;
            }
            else if(numbers[mid]<key)
            {
                start=mid+1;
            }
        }
        System.out.println("KEy not found");
    }
}
