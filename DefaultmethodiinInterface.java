interface I{
    default void show(){
        System.out.println("Hello !");
    }
   
    void temp();
    
}
class B implements I{ 
   

}
class interphase {
    public static void main(String[] args) {
        B ob =new B();
        ob.show();

        
        
    }
}
