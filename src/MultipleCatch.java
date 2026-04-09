import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // Array size
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();          // Index to access
        int divisor = sc.nextInt();        // Divisor

        try {
            int result = arr[index] / divisor;
            System.out.println(result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } 
        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
}
