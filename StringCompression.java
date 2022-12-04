import java.io.StringBufferInputStream;

public class AllStrings {
    public  static  StringBuilder Compressions(String str){
        StringBuilder sb=new StringBuilder("");
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count=1;
            sb.append(ch);
            while((i<str.length()-1)&& (ch== str.charAt(i+1))){
                count++;
                i++;
            }
            if(count>1){
                sb.append(count);
                count=0;
            }
        }
        return sb;
    }
    public  static StringBuilder  Stringset(String str){
      
        if(str.length()==0){
            return null;
        }
        StringBuilder sb=new StringBuilder("");
       char ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' '  ||  str.charAt(i)==','){
           
            if(str.charAt(i)==' ')
            sb.append(' ');
            else{
                sb.append(',');

            }
            i++;
            if(i<str.length()){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }else{
            sb.append(str.charAt(i));
        }
       }
       return sb;

    }
    static boolean Palindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        // System.out.println(Palindrom("aca"));
        // String str="hi,i am lakhan gupta";
        // System.out.println(str);
        // System.out.println(Stringset(str));
        String str="aaaabbbbbcccccdd";
        System.out.println(Compressions(str));

        
    }
}
