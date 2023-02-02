public class que_5 {
    public static void main(String[] args) {
        int n= 5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){//A
                if (i==0 || i==(n-1)/2 || j==0 || j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//A
                if (i==0 || i==(n-1)/2 || j==0 || j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//Y
                if (i==j && i<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//U
                if (i==(n-1) || j==0 || j==(n-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//S
                if (i==0  || j==0 && i<=(n-1)/2 || i==n-1 || i==(n-1)/2 || j==n-1 && i>=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//H
                if (j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
