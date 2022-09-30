class A{
    void show(){
        System.out.println("I am in 3");
    }

}
class B extends A{
    void show(){
        super.show();
        System.out.println("I am in 2");
    }
    void m1(){
        super.show();
    }
}


public class withSuperclc {
    public static void main(String[] args) {
        
       B ob=new B();
       ob.show();
       ob.m1();
    }
}
