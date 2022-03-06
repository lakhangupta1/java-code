public class methodoverloading {
    static void foo(){
        System.out.println("hello lakhan gupta ji");
    }
    static int  foo(int a){
        System.out.println("hello is not printed ");
        return a;

    }
    static int foo(int  a,int b){
        System.out.println("not is lakhan ji ");
        return a+b;
    }
    public static void main(String[] args) {
    
        foo();
        int a=foo(10);
        System.out.println("The value of c is "+a);
        int c=foo(10,20);
        System.out.println("The value of c is "+c);
        

    }
}
