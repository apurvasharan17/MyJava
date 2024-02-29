public class ArrayPairs {
    public static void main(String args[])
    {
        int num[]={2,3,4,5,6,7};
        for(int i=0;i<num.length-1;i++) //it should be num.length-1 
        {   int curr=num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("("+curr+","+num[j]+") ");
            }
            System.out.println();
        }
    }
}
