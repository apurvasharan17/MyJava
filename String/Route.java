package String;
// import java.util.*;

public class Route {

    public static void route(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        int displacement=(int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(displacement);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        route(str);

    }
}
