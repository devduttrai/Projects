package JavaBasics;

public class app {
    static int xorOfArray(int arr[], int n) {
        // Resultant variable
        int xor_arr = 0;

        // Iterating through every element in
        // the array
        for (int i = 0; i < n; i++) {

            // Find XOR with the result
            xor_arr = xor_arr ^ arr[i];
        }

        // Return the XOR
        return xor_arr;
    }

    // Driver Code
    public static void main(String[] args) {

        int arr[] = { 3, 7 };
        int n = arr.length;

        // Function call
        System.out.println(xorOfArray(arr, n));
    }
}
