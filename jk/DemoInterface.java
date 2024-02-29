import java.util.Scanner;
public interface Area{
    public double area();
    
}
public class Rectangle implements Area{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
}

public class Triangle implements Area{
    int l,b;
    Triangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return 0.5*l*b;
    }
}
public class DemoInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of l and b");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle r=new Rectangle(l,b);
        Triangle t=new Triangle(l,b);
        System.out.println("The area of Rectangle is"+r.area());
        System.out.println("The area of Triangle is"+t.area());
    }
}
