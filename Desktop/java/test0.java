class tst{
    void m1(){
        System.out.println("hello");
         m2(this);                             //this is as same as //   tst ob =new tst();        m2(ob);
    }
    void m2(tst t){
        System.out.println(t);

    }
}


class test0{
    public static void main(String args[]){
        tst ob=new tst();
        ob.m1();

    }
}