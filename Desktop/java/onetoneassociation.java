class person{
    String Name;
    String City;
    String state;
    passport pass;
     
    person(String Name1,String City1,String state1,passport pass1){
        Name=Name1;
        City=City1;
        state=state1;
        pass=pass1;
    }
    void display(){
        System.out.println("----------------------------------------");
        System.out.println(" person Name is :"+Name);
        System.out.println(" person City is :"+City);
        System.out.println(" person state is :"+state);
        System.out.println(" person passport id is :"+pass.passid);
        System.out.println(" person validation  is :"+pass.validation);
    }
}
class passport{
    String passid;
    String validation;
    passport(String passid1,String validation1){
        passid=passid1;
        validation=validation1;
    }
}
class onetoneassociation{
    public static void main(String[] args){
        passport pas=new passport("1001","02-04-2030");
        person per=new person("lakhan","deoria","uttarpradesh",pas);
        per.display();
        passport pas1=new passport("1001","02-04-2030");
        person per1=new person("ajit","deoria","uttarpradesh",pas1);
        per1.display();

    }
    
}
