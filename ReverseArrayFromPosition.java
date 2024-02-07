import java.util.Scanner;

public class ReverseArrayFromPosition {

    public static void reverse(int[] arr, int n, int l) {
        int[] ans = new int[n]; // allocate space for the reversed array

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - l) % n; // calculate new index using modulo operation
            ans[newIndex] = arr[i]; // store element at new index in the reversed array
        }

        // copy the reversed elements back to the original array (optional)
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array reversal program:");
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the position from which to reverse (l): ");
        int l = scanner.nextInt();

        reverse(arr, n, l);

        System.out.print("Array elements after reversal are: ");
        print(arr);
    }
}
