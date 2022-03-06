import java.util.Scanner;
public class calculator {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        String yn,sys;
        do{
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        System.out.println("Enter the symbol (+,-,*,/)");
        sys=sc.next();
        switch(sys){
            case "+":
               System.out.println("The adding of two number is "+(num1+num2));
               break;
            case "-":
            System.out.println("The substract of two number is "+(num1-num2));
            break;
            case "*":
            System.out.println("The multiply of two number is "+(num1*num2));
            break;
            case "/":
            System.out.println("The devide of two number is "+(num1/num2));
            break;
            default:
            System.out.println("Invalid symbol");
            break;

        }
        System.out.println("Enter your choise y for again otherwise no for calculating");
        yn=sc.next();

    }
    while(yn.equals("y")||yn.equals("Y"));

        
    }
    
}
