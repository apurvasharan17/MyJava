package String;

public class StringCompression {
    public static String compress(String str){
        // String newStr="";
        StringBuilder str2=new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            // newStr=newStr +str.charAt(i);
            str2.append(str.charAt(i));
            if(count>1){
                // newStr+=count.toString();
                str2.append(count);
            }
        }
        // return newStr;
        return str2.toString();
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }

}
