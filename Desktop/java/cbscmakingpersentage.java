import java.util.Scanner;
class cbscmakingpersentage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total marks");
        float total_marks=sc.nextInt();
        float total;
        System.out.println("Enter the marks  of subject1 ");
        float s1=sc.nextInt();
        System.out.println("Enter  the s marks of subject2");
        float s2=sc.nextInt();
        System.out.println("Enter the marks of subject3 ");
        float s3=sc.nextInt();
        System.out.println("Enter  the  marks of subject4");
        float s4=sc.nextInt();
        System.out.println("Enter the marks of subject5");
        float s5=sc.nextInt();
        total=s1+s2+s3+s4+s5;
        float persentage=(total*100)/(total_marks*5);
        System.out.println("This is your persentage "+persentage+"%");


    }
    
}
