package Patterns;

public class Main {
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();

        Pattern2(4);
        System.out.println();

        Pattern3(5);
        System.out.println();

        Pattern4(5);
        System.out.println();

        Pattern5(5);
        System.out.println();

        Pattern6(5);
        System.out.println();

        Pattern7(5);
        System.out.println();

        Pattern8(5);
        System.out.println();
    }

    public static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
      for(int i=n;i>0;i--){
          for(int j=0;j<i;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }

    public static void Pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Pattern5(int n){
        for(int i=0;i<2*n;i++){
            int colsInRow=i>n ? 2*n -i:i;
            for(int j=0;j<colsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void Pattern8(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
               for(int j=0;j<=i;j++){
                   System.out.print("*");
               }
            System.out.println();
        }
    }
}

