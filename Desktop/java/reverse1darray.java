public class reverse1darray {
     public static void main(String[] args) {
         
        int m1[]={1,2,3,6,7,8,8,9,0,2,3,45,56};
        int temp;
        int i=0;
        int j=m1.length-1;
        while(i<j){ 
            temp=m1[i];
            m1[i]=m1[j];
            m1[j]=temp;
            i++;
            j--;
        }
        for(int element:m1){
            System.out.print(" "+element);
        }
     }
}
