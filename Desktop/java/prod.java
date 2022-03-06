import java.util.*;
public class prod {
    public static int prod(int a,int b){
        return a*b;
    }
    public static void main(String args[]){

        System.out.println("Enter the two number =");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod1=prod(a, b);
        System.out.println("product of two number is "+prod1);
    }
    
}
