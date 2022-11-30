public class All {
    static void Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i+1;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second loop
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void HollowRhombos(int n){
        for(int i=n;i>=1;i--){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            if(i==n || i==1)
           {    for(int j=1;j<=n;j++){
                System.out.print("*");
                 }
        }else{
            System.out.print("*");
            for(int j=1;j<n-1;j++){
                System.out.print(" ");

        }
            System.out.print("*");

        }
        System.out.println();
    }
}
    static void spacewithPattern(int n){
        for(int i=n;i>=1;i--){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void ButterFly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }

        //Oppsosite of Butterfly .
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
              
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern(int m,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==m-1|| j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    static void Pattern1(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Pattern(5, 5);
        // Pattern1(5);
        // ButterFly(10);
        // spacewithPattern(5);
        // HollowRhombos(5);
        Diamond(6);
        
    }
}
