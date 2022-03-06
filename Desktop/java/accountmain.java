class Account 
{
    private int amount ;
    private String accono;
    public void setaccount(String accono){
        this.accono=accono;
    
    }
    public String getacconut(){
        return accono;
    }
    public void setamount(int amount){
        this.amount=amount;
    }
    public int  getamount(){
        return amount;

    }
}
class bankfunction{
    void deposit(Account acc,int amount){
        int total=acc.getamount()+amount;
        acc.setamount(total);
    }
    void withdrawl(Account acc ,int wthamt){
    
        int total=acc.getamount()-wthamt;
        acc.setamount(total);
    }
}
public class accountmain { 
    public static void main(String[] args) {
        Account ob1=new Account();
        ob1.setaccount("12345678911");
        ob1.setamount(5000);
        System.out.println("Account details:"+ob1.getacconut()+"  Amount is "+ob1.getamount());
        bankfunction b1=new bankfunction(); 
        System.out.println("after 200 withdrawl Account deatils is :->");
         b1.deposit(ob1,10000);
         b1.withdrawl(ob1, 200);
         System.out.println("Account details:"+ob1.getacconut()+"  Amount is "+ob1.getamount());
         System.out.println(" ");

    }
    
}
