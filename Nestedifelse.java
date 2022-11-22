import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>=20){
            if(y>=100){
                z=z+100;
            }else if(y>=50){
               z+=50;
            }else{
                z+=10;
            }

        }
        else {
            if(y>=100){
                z+=3;
            }
            else if(y>=50){
                z+=2;
            }
            else{
                z+=1;
            }

        }
        System.out.println(z);
        
    }
}
