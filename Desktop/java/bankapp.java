class Account {
    String name ;
    String accono;
    int balance;

    Account(String accono1,String name1 ,int  balance1){
     accono=accono1;
     name=name1;
     balance=balance1;
    }
}
class transation{
    void deposite(Account account,int amount){
        account.balance+=amount;
        System.out.println("transaction is successfully");
        System.out.println("The amount is :"+account.balance);
        System.out.println("THe account no is :"+account.accono);
        System.out.println("The account holder name is :"+account.name);   
        System.out.println("-----------------------------------------"); 
    
    }
}


public class bankapp{
    public static void main(String[] args) { 
        Account acc1=new Account("12345","deepak",10000);
        transation tr1=new transation();
        tr1.deposite(acc1,5000);
        
        Account acc2=new Account("12346","Lakhan gupta ",15000);
        transation tr2=new transation();
        tr1.deposite(acc2,56000);
        


    }
   
    
}
