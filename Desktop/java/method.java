import java.util.*;
public class method {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
      
        for(int i=1;i<=n;i++){
            int a=0;
        for(int j=2;j<i;j++){ 
            if(i%j==0){
            a=1;
        }


        }
        if(a==1){
            System.out.println("The number "+i+"is not prime ");
        }
        else {
            System.out.println("The number"+i+" is prime ");
        }
      }
    }
    
}
