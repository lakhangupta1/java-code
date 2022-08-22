
abstract class test{
       
    abstract void sum();
       
    
}
class test2 extends test{
    void  sum(){
        System.out.println("lkjggjj");
        //return 0;
    }
}
public class abstrc{
    public static void main(String[] args) {
        test2 ob=new test2();
        ob.sum();
    }
}

