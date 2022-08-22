class account{
    private int amount;
    private  String accno;
    public void setAmount(int amount1){
        this.amount=amount1;
    }
    public int getamount(){
        return amount;
    }
    public void setaccno(String accno){
        this.accno=accno;
    }
    public String getaccno(){
        return accno;

    }
}
class bankaccount{ 
    public void diposite(account acc,int amount){
        int total=acc.getamount()+amount;
        acc.setAmount(total);
    }
    public void whithdrawl(account ob2 ,int amount3){
      //  account ob2=new account();
        if(ob2.getamount()<amount3){
            System.out.println("Your balance is insufficient ");
        }
        else {
        int total =ob2.getamount()-amount3;
         ob2.setAmount(total);
        System.out.println("withdral is successfull");
        System.out.println("Your amount is :"+ob2.getamount());
        }
    }

}
class bank{
    public static void main(String args[]){
      
        account ob1=new account();
        ob1.setAmount(10000);
       int k= ob1.getamount();
       System.out.println("This is your ammount "+k);
       bankaccount  bank1=new bankaccount();
       bank1.diposite(ob1, 5000);
       System.out.println("How many mony you want to withdrwal");
       bank1.whithdrawl(ob1, 3000);


    }
}
