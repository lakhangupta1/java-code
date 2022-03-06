class Branch{
    int branch_id;
    String branch_name;
    Branch(int branch_id1,String branch_name1){

        branch_id=branch_id1;
        branch_name=branch_name1;

    }
}
class Student{
    int roll_no;
    String name;
    Branch branch;
    Student(int roll_no1,String name1,Branch branch1){
     
        roll_no=roll_no1;
        name=name1;
        branch=branch1;
    }
    void studentdeatails(){
        System.out.println("Roll_no is :"+roll_no);
        System.out.println("Student name is :"+name);
        System.out.println("Branch code is :"+branch.branch_id);
        System.out.println("Branch _name is :"+branch.branch_name);
        System.out.println("---------------------------------------");
    }
}


public class manytoone1 {
    public static void main(String[] args) { 
        Branch b1=new Branch(501,"IT");
        Student ob1=new Student(101,"lakhan gupta ",b1);
        Student ob2=new Student(102,"ajit gupta ",b1);
        Student ob3=new Student (103,"vikas gutpa ",b1);
        ob1.studentdeatails();
        ob2.studentdeatails();
        ob3.studentdeatails();
        
        
    }
    
}
