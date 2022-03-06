class language{
    String  langid;
    String  langname;
    language(String langid1,String langname1){
        langid=langid1;
        langname=langname1;
    }
}
class Student {
    int roll_no;
    String name ;
    language[] lang;
    Student(int roll_no1,String name1,language[] lang1){
        roll_no=roll_no1;
        name=name1;
        lang=lang1;
    }
    void student_datails(){
        System.out.println("student Roll no is :"+roll_no);
        System.out.println("student name is :"+name);
        System.out.println("->->->this student having knowledge of language ->->->");
        for(int i=0;i<lang.length;i++)
        System.out.println("language ID is :"+lang[i].langid+"      language name is :"+lang[i].langname);
        System.out.println("----------------------------------------");
    }
    
}


public class manytomany {
    public static void main(String[] args) {
        language l1=new language("java01","java");
        language l2=new language("c01","C");
        language l3=new language("C++01","C++");
        language l4=new language("python01","python");
        language lang[]={l1,l2,l3,l4};
        language lang2[]={l1,l3,l4};
        Student ob1=new Student(101,"shivanand yadav ",lang);
        Student ob2=new Student(102,"utkarsh chaudhary ",lang);
        Student ob3=new Student(103,"byas paswan ",lang2); 
        ob1.student_datails();
        ob2.student_datails();
        ob3.student_datails();       
    }
    
}
