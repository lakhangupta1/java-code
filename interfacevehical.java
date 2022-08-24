interface vehical{
     void start();
     void NoOfgear(int gears);
}
class car implements vehical{
   public  void start(){
        System.out.println("this is start with key ");
    }
    public void NoOfgear(int gears){
        System.out.println("car has "+gears+"No of gears ");
    }
}
class bus implements vehical{
    
     public void start(){
        System.out.println("Bus will also start with key ");

    }
    public void NoOfgear(int gears){
        System.out.println("Bus have "+gears+" No of gears");

    }
}
public class vehicalmain {
    public static void main(String [] args){
        bus b=new bus();
        b.start();
        b.NoOfgear(3);

    }
}
