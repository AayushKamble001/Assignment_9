public class que_1 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            System.out.print("  ");
            for (int j=0;j<n;j++){//A
                if (i==0 || i==(n-1)/2 || j==0 || j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//B
                if (j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i%2!=0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//C
                if (i==0 || j==0 || i==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//D
                if (j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//E
                if (i==0 || i==(n-1)/2 || i==n-1 || j==0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//F
                if (i==0 || j==0 || i==(n-1)/2 && j<n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){//G
                if (i==0  || j==0 || i==n-1 || i==n-1 || i==(n-1)/2 && j!=1 || j==n-1 && i>=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
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
