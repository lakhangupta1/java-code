class student{
     
    String name;
    String f_name;
    String  address;
   
    student(String name1,String f_name1,String address1){
        name=name1;
        f_name=f_name1;
        address=address1;
    }
}
class Branch{
    String Branchc;
    int  Bcode;
    student[] st;
    Branch(String Branch1,int Bcode1,student[] st1){
        Branchc=Branch1;
        Bcode=Bcode1;
        st=st1;
    }
    void display(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Branch name is."+Branchc);
        System.out.println("Branch code is "+Bcode);
        for(int i=0;i<=st.length;i++){
         
            System.out.print((i+1)+". name:"+st[i].name);
            System.out.print("  f_name:"+st[i].f_name);
            System.out.print("  address:"+st[i].address);
            System.out.println();
        }
    }
}
public class manytoone { 
    public static void main(String[] args){


        student st1=new student("lakhan","Girajesh","mahuapatan");
        student st2=new student("ajit","Girajesh","mahuapatan");
        student st3=new student("shivanand","Ramkripal","Narayanpur");
        student st4=new student("Byaspaswan","patanahi","padaurauna");
        student st5=new student("utkarsh chaudary","such me pata nahi ","padaurauna");
        //System.out.println("student deatails..");
        student[] std={st1,st2,st3,st4,st5};
        Branch br=new Branch("IT",1001,std);
        br.display();
       
        student sd1=new student("apurva","shri batum mishra","mahuapatan");
        student sd2=new student("dheeraj patel","rampat patel","mahuapatan");
        student sd3=new student("Talak","Ajamullah ansari","Narayanpur");
        student sd4=new student("anirudh","vinod paswan","padaurauna");
        student sd5=new student("Attiullah ansari","Abdullah ansari","mahuapatan");
        student[] sdd={sd1,sd2,sd3,sd4,sd5};
        Branch brc=new Branch("CSE",2001,sdd);
        brc.display();

    }
    
}
