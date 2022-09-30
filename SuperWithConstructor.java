class A{

    A(){
        System.out.println("This is Construtor of A");
    }
    A(int a){
        System.out.println("This is nomber "+a);
    }
    void show(){
        System.out.println("I am in 1");
    }

}
class B extends A{
      B(){
        super();
       
      }
      B(int a){
        super(a);

      }
    void show(){
       
        System.out.println("I am in 2");
       
    }

}

public class superwithcostructor {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();

        B ob1=new B(4);
        ob1.show();
    }
}
