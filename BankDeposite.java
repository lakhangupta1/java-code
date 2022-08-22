class Account{
    String Accountno;
    String Name;
    int balance;
    Account(String Accountno,String Name,int balance){
        this.Accountno=Accountno;
        this.Name=Name;
        this.balance=balance;
    }
    void setamount(int amount){
        balance=amount;
    }
    
}
class deposite{
    deposite(Account ac,int amount){
        int total=ac.balance+amount;
        ac.setamount(total);


    }
   

}
class showbalance{
    Account ac;
    showbalance(Account Ac){
        System.out.println("this is the Balance of this account :"+Ac.balance);
    }
}
public class Bankdeposite {
    public static void main(String[] args) {
        Account ac=new Account("1111100000","lakhan gupta",10000);
        deposite dp=new deposite(ac,5000);
       // System.out.println(ac.balance);

        showbalance sb=new showbalance(ac);
        
    }
    
}
