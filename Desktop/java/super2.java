class a{
    void show1(){
        System.out.println("i am in first class ");
    }
}
class b extends a{
    void show2(){
         super.show1();                    // this is super class  whisch is refer to parent class ......
        System.out.println("i am in second class ");
    }
}



public class super2 {
    public static void main(String args[]){ 
        b ob =new b();
        ob.show2();
                                                 //   also we can write now  ////////          ob.show1();
    }
    
}
