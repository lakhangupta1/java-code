public class addingtwomatrix {
    public static void main(String[] args) {
        int mat1[][]={{1,2,3},{4,5,6}};
        int mat2 [][]={{7,8,9},{0,1,4}};
        int result[][]=new int [mat1.length][mat1[1].length];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<result.length;i++){
        for(int j=0;j<result[1].length;j++){
            System.out.print(" "+result[i][j]);
        }
        System.out.println();
        }
    }
    
}
