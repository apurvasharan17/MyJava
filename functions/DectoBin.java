package functions;

public class DectoBin {
    public static void DecimaltoBinary(int decNum)
    {
        int pow=0;
        int binNum=0;
        int myNum=decNum;
        while(decNum>0){
            int rem = decNum % 2;
            binNum=binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;

        }
        System.out.println("binary form of " +myNum+" is "+ binNum);

    }
    public static void main(String[] args) {
        DecimaltoBinary(9);
    }
}
