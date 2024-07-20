package evennumber;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Swap logic using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Output the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num2);
        System.out.println("Second number: " + num1);
        
        scanner.close();
    }
}