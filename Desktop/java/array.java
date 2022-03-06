import java.util.*;
public class array {
    public static void main(String args[]){
        int[] marks=new int[20];
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {   
            System.out.println("Enter the number");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+marks[i]);
        }

    }
    
}
