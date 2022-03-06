public class reversedijit {
    public static void main(String args[]){
         int num=1234;
         int d;
         int rev=0;
         int p=num;
         while(num!=0){
            d=num%10;
             num=num/10;
            rev=rev*10+d;
         }
         System.out.println(("Reverse digit of  "+p+" is "+rev));
    }
    
}
