class demo{
    int empid;
      String empname;
      static  String  empcomname="smart progrmming";       //this is static variable ..........
       

    demo(int empid,String empname){
          this.empid=empid;
          this.empname=empname;
      }
      void display(){
          System.out.println("--------------------------------------Employ details :---------------------");
          System.out.println("This is empid  "+empid);
          System.out.println("This is empname  "+empname);
          System.out.println("This is empcompany name  "+empcomname);
      
        System.out.println();
        }
}



class  staticdemo{
      public static void main(String args[]){
   
        demo emp1=new demo(101,"lakhan gupta");
        demo emp2=new demo(102,"ajit  gupta");
        demo emp3=new demo(103,"vikas gupta");
        emp1.display();
        emp2.display();
        emp3.display();
            
            
         


      }
}