import java.util.Random;
import java.util.Scanner;
class  Game{ 
   public int gessnumber;
   public int inputnumber;

    Game(){
        Random rand=new Random();
        this.gessnumber=rand.nextInt(100);
    }
    void inputnum(int x){
   
      this.inputnumber=x;
    }
    boolean iscorrect(Game ob){

        if(ob.gessnumber==ob.inputnumber){
            System.out.println("congratulation!!!");
            return true;
        }
        else if(ob.gessnumber<ob.inputnumber){
            System.out.println("number is high ");
        }
        else {
            System.out.println("number is low");
        }
        return false;


    }
}



public class gueissinggame {
    public static void main(String[] args) {
        boolean b=false;
        Game ob=new Game();
        // System.out.println(" "+ob.gessnumber);
        int x;
        Scanner sc=new Scanner(System.in);
        while(!b){
            System.out.println("Enter the number :");
            x=sc.nextInt();
            ob.inputnum(x);
           ob.iscorrect(ob);
          
        }

    }
    
}
