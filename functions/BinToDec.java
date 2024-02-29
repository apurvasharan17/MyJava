
package functions;
// import java.util.*;
public class BinToDec {
    public static void BinaryToDecimal(int binNum){
        int pow=0;
        int decNum=0;
        int binn=binNum;
        while(binNum>0){
            int lastDigit=binNum %10;
            decNum=decNum +(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;


        }
        System.out.println("decimal of "+binn+" is "+decNum);

    }
    public static void main(String[] args) {
        BinaryToDecimal(1001);
    }
}
