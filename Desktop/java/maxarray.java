public class maxarray {
    public static void main(String[] args) {
        int m1[]={2,3,4,67,8,9,0,23};
        int min=m1[0];
        for(int i:m1){
            if(i<min){
                min=i;
            }
        }
        System.out.println("The value is "+min);
    }
}
