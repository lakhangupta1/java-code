class libraryd{
    String[] books=new String[20];
    books.[0]="dbms";
    books.[1]="c++";
    books.[2]="python";
    books.[3]="operating system";
    books.[4]="networking";
    String issuebook(String book){
        for(int i=0;i<books.length;i++){
            if(book==books[i]){
                String temp=books[i];
            
                for(int j=i;j<books.length-1;j++){
                     books[j]=books[j+1];
                     return temp;
                }
                
            }
            else{ 
                System.out.println("bokks is not available !");
                    
            }
        }
    }
    void setbook(String book){
        
        
    }

}
public class libraryusing {
    
}
