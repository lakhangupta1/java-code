class a{
      void display1(){
          System.out.println("hello");     // class 's  methods
      }
}
class b extends a{
    void display2(){                     ///this is ovrerriding in polymorphism ........
        System.out.println("hi");
    }                                  // this will change the body of method of parent class ...
    public static void main(String[] args){
        a ob1=new b();
        ob1.display1();
    }
}