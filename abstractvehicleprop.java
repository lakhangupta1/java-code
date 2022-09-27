abstract class vehicle{
    abstract void start();
    
}
class car extends vehicle
{
    void start (){
        System.out.println("car is start with key !");
    }
}
class scooter extends vehicle{
    void start (){
        System.out.println("car is start with kick !");
    }
}
class abstractclc{
    public static void main(String[] args) {
        scooter ob=new scooter();
        ob.start();
        
    }
}
