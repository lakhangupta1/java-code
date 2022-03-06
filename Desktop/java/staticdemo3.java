class demo{  
    static{
        
    System.out.println("hello 1 2 3 4 5 6 7 8 9 0");

    }
}


public class staticdemo3 { 

  // System.out.println("I am in first main program");
    static{
        System.out.println("this is hello main");
    }
    public static void main(String args[]){ 
        System.out.println("hello main");
        demo ob=new demo();  //when this is not present then class demo is not loaded...


    }
    
}
