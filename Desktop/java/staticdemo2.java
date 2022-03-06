class demo{

    static int no1=10;

  void demo1(){
         System.out.println(no1);                // but reverse is not possible .......
    }
    void display(){
    System.out.println("This is first no1 "+no1);
//  System.out.println("This is first no1 "+no2);
 // this is not posiible 
    }
}
public class staticdemo2{ 
    public static void main(String args[]){
     
        
        demo ob=new demo();
        ob.display();

    } 
    
}
