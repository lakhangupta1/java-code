class outer {
    void show1(){
        System.out.println("1");
    }
    class inner{
        void show2(){
            System.out.println("2");
        }
    }
}



public class nested { 
    public static void main(String args[]){  
        outer ob=new outer();
        ob.show1();
        outer.inner ob2=ob.new inner();
        ob2.show2();

    }
    
}
