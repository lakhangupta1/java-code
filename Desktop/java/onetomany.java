class student{
    String name;
    String f_name;
    String l_name;
    course[] mul;
    student(String name1,String f_name1,String l_name1,course[] mul1){
        name=name1;
        f_name=f_name1;
        l_name=l_name1;
        mul=mul1;
    }
    void disk(){
        System.out.println("--------------------------------------------------------");
        System.out.println("student deatails.");
        System.out.println("name:"+name);
        System.out.println("f_name:"+f_name);
        System.out.println("l_name"+l_name);
        System.out.println("name of course ");
        for(int i=0;i<=mul.length;i++){
            System.out.println((i+1)+".  course  "+mul[i].coursename);
        }
    }

}
class course{
   
    String coursename;
    course(String coursename1){
   
     coursename=coursename1;
    }
}
class onetomany{
    public static void main(String[] args){
    course ob1=new course("C");
    course ob2=new course("C++");
    course ob3=new course("php");
    course ob4=new course("SQL");
    course[] c={ob1,ob2,ob3,ob4};
    student std=new student("lakhan","girajesh gupta","gupta",c);
    
     std.disk();
    }
   

}