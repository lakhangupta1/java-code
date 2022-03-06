class test{
     test(){
        this(10);
        System.out.printf("this is first construction ");

    }
    test(int no){
       
        this("lakhan gupta");
        System.out.println(no);
        System.out.println("this is second construction ");

    }
    test(String name){
        System.out.println(name);
        System.out.println("This is third construction");
         
    }
}

class constructionchanning {
    public static void main(String[] args){
       
        test ob1=new test();

    }
  

    
     
    
}

