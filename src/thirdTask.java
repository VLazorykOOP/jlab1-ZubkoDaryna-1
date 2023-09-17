import java.util.Scanner;

public class thirdTask {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n(<20): ");
                
                int n = in.nextInt();                  
                  boolean[] Y = new boolean[n];

                if(n<20)
                {  
                     int[][] X = doubleArray(n);
                    for (int i = 0; i < n; i++) {
                        Y[i] = isUnique(X[i]);
                    }
                    System.out.print("Vector Y: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(Y[i] + " ");
                    }                }
                else{
                      System.out.println("Invalid value of n(n<20)");
                    }
                    in.close(); 

    }
    static int[][] doubleArray(int n){ 
        Scanner in=new Scanner(System.in);
        int[][] X =new int[n][n];
        for(int i=0;i<n;i++){
            System.out.print("Add value for "+(i)+" row ");
            for (int j=0;j<n;j++){
           X[i][j]= in.nextInt();
            }
        }              
            in.close(); 
          return X;
    }
    static boolean isUnique(int[] X) {
        for (int i = 0; i < X.length; i++) {
            for (int j = i+1; j < X.length; j++) {
                if (X[i] == X[j]) {
                    return false; 
    
            }
        }
    }     
       return true; 
        }
}
