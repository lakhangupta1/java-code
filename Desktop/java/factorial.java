import java.util.*;
public class factorial{ 
    public static int fact(int a) {
        if(a==0||a==1)
        {
            return 1;
        }
        return a*fact(a-1);

        
    }
    public  static void  main(String args[]) {  
       Scanner sc=new Scanner(System.in);
       System.out.println("Ente the number for factorial ");
       int a=sc.nextInt();
       int f=fact(a);
       System.out.println("factorial of given number is "+f);

        
    }
    
}
