class phone
{
    public void off1(){
        System.out.println("phone is off .....");
    }
    public void on(){
        System.out.println("phone is on");
    }
}
class smartphone extends phone
{
    public void on(){
        System.out.println(" smartphone is on");
    }
    public void off(){
    System.out.println(" smartphone is off");
    }
}

public class dispatch {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.on();
        //obj.off();
        obj.off1();
        
    }
}
