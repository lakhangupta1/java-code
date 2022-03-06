public class localvar { 
     static int c=12;
    public static void main(String args[]) {
        int a=10;
        {
            int b=20;
            System.out.println("local vaue is "+b);

        }
        System.out.println("local vaue is "+a);
        //System.out.println("local vaue is "+b);
      //  System.out.println(c);
      localvar oc=new localvar();
      System.out.println(oc.c); // we can access by objectt ;
      System.out.println(c);   /// we can access by without object ......
    }
    
}
