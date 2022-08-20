class Student{
    String name;
    String SId;
    Course[] arr;
    Student(String name1,String Sid, Course[] arr1){
        name=name1;
        arr=arr1;
    }
    void show(){
    System.out.println("Student Name is : "+name);
    System.out.println("Student Id  is : "+ SId);
    System.out.println("Course Details is --");
    for(int i=0;i<arr.length;i++){
        System.out.println("Course no "+(i+1)+"  course id is :"+arr[i].courseId+" name is "+arr[i].coursename);
    }
    System.out.println("--------------------------------------");
    
     }
}
class Course{
    String coursename;
    String courseId;
    Course(String coursename1,String courseid  ){
        coursename=coursename1;
        courseId=courseid;
    }


}
public class OneToMany1 {
    public static void main(String[] args) {
         Course cs=new Course("Java "," J01");
         Course cs1=new Course("Python","P01");
         Course cs2=new Course("C++", "C-1");  
         Course cs3=new Course("C++", "C-1");       
           
         Course []ar=new Course[4];
         ar[0]=cs;
         ar[1]=cs1;
         ar[2]=cs3;
         ar[3]=cs2;
         Student lakhan=new Student("lakhan", "10", ar);
         
         lakhan.show();
        
    }
}
