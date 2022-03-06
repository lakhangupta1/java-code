class a{
    int no=10;
}
class b extends a{ 
    int no=20;
    void show(int no){
    System.out.println("hello");
    System.out.println("this is your given nomber  "+no);
    System.out.println("this is instance no of variable  "+this.no);
    System.out.println("this is super's value which is in super class "+super.no);



    }
}

public class superclass {
    public static void main(String args[]){
        b ob=new b();
        ob.show(25);



    }
    
}
