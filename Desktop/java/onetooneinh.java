class address{
    String city;
    String distric;
    String state;
    address(String city1,String distric1,String state1){
        city=city1;
        distric=distric1;
        state=state1;

    }
  
}
class employee{
    String empid;
    String empname;
    address addr;
    employee(String empid1,String empname1,address addr1){
       
        empid=empid1;
        empname=empname1;
        addr=addr1;
    }
    void display(){
        System.out.println("---------------------------------------------");
        System.out.println("name of empid:"+empid);
        System.out.println("name of empname:"+empname);
        System.out.println("name of address:"+addr.city);
        System.out.println("name of distric:"+addr.distric);
        System.out.println("name of state:"+addr.state);
        System.out.println("---------------------------------------------");
    }
}
class onetooneinh{
    public static void main(String[] args){
      
        address ad1=new address("gorakhapur","deoria","uttarpradesh");
        employee emp1=new employee("100","lakhan",ad1);
        emp1.display();
        
        address ad2=new address("gorakhapur","deoria","uttarpradesh");
        employee emp2=new employee("101","shivanand",ad2);
        emp2.display();
    }
}