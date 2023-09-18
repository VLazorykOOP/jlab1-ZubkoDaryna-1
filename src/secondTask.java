import java.util.HashSet;
import java.util.Scanner;
//11
public class secondTask {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Second Task");

        System.out.println("A array(<500):");
         int[] A= Input(in,500);
        System.out.println("B array(<200):");

         int[] B= Input(in,200);

        int[] unionArray = Union(A, B);
        System.out.println("A Y B:");
        Print(unionArray);
        int sum = sumOfUnion(unionArray);
        System.out.println("Sum of elements: " + sum);
                in.close();
    }


    static int[] Input(Scanner in, int maxSize) {
        System.out.println("Size of array=");
        int n = in.nextInt();
      
        if (n >= maxSize) {
            System.out.println("Error: Array size should be less than "+ maxSize);
            System.exit(1);
        }    

             int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "] = ");
            a[i] = in.nextInt();
        }
        return a;
    }
    public static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]="+a[i] +" " );
        }
        System.out.println();
    }
    public  static int[] Union(int[] a, int[] b) {
        HashSet<Integer> union = new HashSet<>();
        for (int num : a) {
            union.add(num);
        }
        for (int num : b) {
            union.add(num);
        }
    
        int[] unionArray = new int[union.size()];
        int index = 0;
    
        for (int num : union) {
            unionArray[index] = num;
            index++;
        }
    
        return unionArray;
    }
    public static int sumOfUnion(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
