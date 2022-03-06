class a{ 
    a(){
    System.out.println("i am in first class ");


    }
    a(int no){
        System.out.println("this is nomber "+no);
    }
}
class b extends a{
    b(){  
    
        super();
        System.out.println("i am in second class "); 
      //     super();         // this is not posiible  here .//////    
                                   ///     and also we can not write this and super  keyword  together .... 
       
    }

}



public class makingsuperclass { 
    public static void main(String args[]){ 
        b ob=new b();
        

    }
    
}
