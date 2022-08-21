class Student{
    String Sname;
    String Sid ;
    Branch br;
    Student(String Sname1,String Sid1,Branch br1){
        Sname=Sname1;
        Sid=Sid1;
        br=br1;
    }
    void getdetails(){
        System.out.println("Student Name is : "+Sname);
        System.out.println("Student ID is : "+Sid);
        System.out.println("Student 's Branch ");
        System.out.println("Brach ID is :"+br.BranchId);
        System.err.println("Branch Name is : "+br.BranchName);
        System.out.println("--------------------------------------------------");
    }

}
class Branch{ 
    String BranchId;
    String BranchName;
    Branch(String BranchId1,String branchName1){
        BranchId=BranchId1;
        BranchName=branchName1;
    }
    
}
public class ManyToOne12 {
    public static void main(String []args){
        Branch br=new Branch("001#","IT/CS");
        Student st=new Student("Lakhan gupta ","01", br);
        Student st1=new Student("Ajit  gupta ","02", br);
        Student st2=new Student("Vikash gupta ","03", br);
        Student st3=new Student("Archit  gupta ","04", br);
        Student st4=new Student("Lallan gupta ","05", br);
        st.getdetails();
        st1.getdetails();
        st3.getdetails();
        st2.getdetails();
        st4.getdetails();




    }
}
