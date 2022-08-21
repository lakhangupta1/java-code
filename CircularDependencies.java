class A{
    B   b;
    Public void setB(B b1){
        System.out.println("This is B ");
        b=b1;
    }

}
class B{

    A a;
    public void setA(A a1){
        System.out.println("this is B ");
        a=a1;
    }
}
public class Circulardependncies {
    public static void main(String []args){
         A ob1=new A();
         B ob2=new B();
           
         ob1.setB(ob2);
         ob2.setA(ob1);

    }
}
