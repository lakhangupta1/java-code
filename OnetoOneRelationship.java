
class Employee{
    String Empid;
    String Empname;
    Address addr;
     Employee(String name,String id,Address addrs){
         Empid=id;
         Empname=name;
         addr=addrs;
     }
      

    void show(){
        System.out.println("Employee id is : "+ Empid);
        System.out.println("Employe name is : "+Empname);
        System.out.println("Employee Address is !");
        System.out.println("State is : "+addr.state);
        System.out.println("City is  : "+addr.City);
        System.out.println("Location is : "+addr.Location);


     }

}
class Address{
    String state;
    String City;
    String Location;
    Address(String state1,String City1,String Location1){
        state=state1;
        City=City1;
        Location=Location1;
    }
}
public class OnetoOne {
    public static void main(String[] args) {
        Address ad1=new Address("Uttar Predesh ","Deoria"," Mahuapatan");
        Employee emp1=new Employee("Lakhan", "01", ad1);


        //second employee.
        Address ad2=new Address("Uttar Predesh ","Deoria ","Mahuapatan");
        Employee emp2=new Employee("Ajeet ", "02",ad2);
        
        
        //third employee 
         Employee emp3=new Employee("Shivanand ","03", ad2);
          
         //thre is first employeee
         emp1.show();

         //thie is second employeee 
         emp2.show();
         //this is third employee 
         emp3.show();


        
    }
    
}
