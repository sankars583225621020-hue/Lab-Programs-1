I am trying to write a Java program to reverse an array. My goal is to take an input array and print it in reverse order.
Expected Output
If input is:
1 2 3 4 5
Expected output:
5 4 3 2 1
Actual Output
The program prints incorrect values or sometimes repeats elements.
What I have tried
I used a loop to iterate through the array from the end, but I think my logic is wrong.

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reversing array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[n - i] + " ");
        }
    }
}