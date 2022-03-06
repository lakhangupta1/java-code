class abc{    
    void m1(){
    final int  a=10;  
                          // a=a+20 ;      we can not reinitialization .. so 
                      // a=a+20;   this will give you error ...so
   System.out.println("we can as final  value of a =" + (a+20));
       }

}

public class finaltest { 
    public static void main(String args[]){ 
        abc ob=new abc();
        ob.m1();
           

    }

    
    
}
