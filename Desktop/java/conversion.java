public class conversion{
    public static void main(String args[]) { 
      
        System.out.println(Integer.parseInt("100",2));
        //to convert  binary to desimal

        System.out.println(Integer.parseInt("10073524",8));
        //To convert  octal  to desimal

        System.out.println(Integer.parseInt("100113",16));
        //To convert  hexadesimal to desimal


        System.out.println(Integer.toBinaryString(100));  //To convert desimal to binary 
        System.out.println(Integer.toBinaryString(100)); //To convert desimal to binary 
        System.out.println(Integer.toHexString(100));   //To convert desimal to hexadesimal
        System.out.println(Integer.toOctalString(100));//To convert desimal to Octal
    }
    
}
