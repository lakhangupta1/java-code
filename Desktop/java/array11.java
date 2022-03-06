import java.util.*;
public class array11 {
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int size=sc.nextInt();
        int[] num=new  int[size];
        System.out.println("Enter the  data ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }


    }
    
}
