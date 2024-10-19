import java.io.*;

class LinearSearch {
    // Method to search for an element in the array
    public static int search(int[] array, int target) {
        // Loop through the array
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        // Initialize the array and target element
        int[] numbers = {2, 3, 4, 10, 40};
        int target = 10;

        // Call the search function
        int index = search(numbers, target);

        // Output the result
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + index);
        }
    }
}

