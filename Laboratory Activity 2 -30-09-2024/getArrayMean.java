import java.util.Scanner;

public class getArrayMean {
    public static void main (String []args) {
        int sum = 0;
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) { 
            System.out.print("Enter number: ");             
            array[i] = scanner.nextInt();
        }
        
        for (int num : array) {
            sum += num;
        }
        
        double mean = (double) sum / n;
        System.out.printf("Mean of the array is: %.2f", mean);
        scanner.close();
    }
}
