class a{
    void show(){


        System.out.println("this is first method ");


    }
}
class b extends a{
    void show(){


        super.show();




        System.out.println("THis is second method ");
        
       
    }
}



public class methodovveride { 
    public static void main(String args[]){ 
        b ob=new b();
        ob.show();

    }
    
}
