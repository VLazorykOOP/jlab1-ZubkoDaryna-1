import java.util.Scanner;

public class Main {
//8
    public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
        System.out.println("First Task");

        // Ввід даних типу double
        System.out.print("x (double) = ");
        double x = in.nextDouble();
        System.out.print("y (double) = ");
        double y = in.nextDouble();

        // Ввід даних типу int
        System.out.print("x (int) = ");
        int x1 = in.nextInt();
        System.out.print("y (int) = ");
        int y1 = in.nextInt();

        // Ввід даних типу double
        System.out.print("x (double) = ");
        double x2 = in.nextDouble();
        System.out.print("y (double) = ");
        double y2= in.nextDouble();


        double FirstPart = (2 * Math.pow(x, 2) + x * y) / Math.pow(x * y, 2);
        double SecondPart = (3 * x * y - Math.pow(y, 3)) / (Math.pow(x, 2) + 2 * Math.pow(y, 2));
        double result1 = FirstPart + SecondPart;

      FirstPart = (2 * Math.pow(x1, 2) + x1 * y1) / Math.pow(x1 * y1, 2);
        SecondPart = (3 * x1 * y1 - Math.pow(y1, 3)) / (Math.pow(x1, 2) + 2 * Math.pow(y1, 2));
        double result2 = FirstPart + SecondPart;

        FirstPart = (2 * Math.pow(x2, 2) + x2 * y2) / Math.pow(x2 * y2, 2);
        SecondPart = (3 * x2 * y2 - Math.pow(y2, 3)) / (Math.pow(x2, 2) + 2 * Math.pow(y2, 2));
        int result3 = (int) (FirstPart + SecondPart); 

        System.out.println("Result for double inputs: " + result1);
        System.out.println("Result for int inputs: " + result2);
        System.out.println("Result for double inputs: " + result3);
        in.close();
    }
}
