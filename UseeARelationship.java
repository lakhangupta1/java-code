class Account{
    String Name;
    String AccountNo;
    String IFSCCODE;
    int Balance;

    Account(String Name1,String AccountNo1,String IFSCCODE1,int Balance1){
        Name=Name1;
        AccountNo=AccountNo1;
        IFSCCODE=IFSCCODE1;
        Balance=Balance1;

    }

}
class Costumer{

    public void deposite(Account acnt,int balance2){
        acnt.Balance+=balance2;
        System.out.println("Balance submitted successfully!");
        System.out.println("Your balance is :  "+acnt.Balance);
    }

   public  void withdral(Account acnt,int balbe){
        if(acnt.Balance<balbe){
            System.out.println("Not sufficient Balance !");
        }else{
            acnt.Balance-=balbe;
            System.out.println("Balance withdral successfully !");
            System.out.println("Your balance is :  "+acnt.Balance);
        }
    }


}
public class usesARelationship123 {
    public static void main(String []args){
    Account ac=new Account("lakhan","123456789", "SBI0MAHU", 10000);
    Costumer cs=new Costumer();
    cs.deposite(ac,5000);
    cs.withdral(ac, 1090000);
    }
    
}
