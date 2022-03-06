public class Reverseofarray {
    public static void main(String[] args) {
        int m1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int temp;
        for(int i=0;i<m1.length;i++){
            for(int j=0+i;j<m1[i].length;j++){
                temp=m1[i][j];
                m1[i][j]=m1[j][i];
                m1[j][i]=temp;
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0+i;j<m1[i].length;j++){
                System.out.print(" "+m1[i][j]);
            }
            System.out.println(); 
        }

    }
}
