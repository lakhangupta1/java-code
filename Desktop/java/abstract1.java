abstract class vahicals{

    abstract void start();
}
class car extends vahicals { 
    void  start (){
        System.out.println("Car start with key ");
    }

}
class scooters extends vahicals {
    void start (){
        System.out.println("Schooter start with kick ");
    }
}
class abstract1{
    public static void main(String[] args ){
        car ob1=new car();
        ob1.start();
        System.out.println("---------------------------------------------");
        scooters ob=new scooters();
        ob.start();
        
    }
}

