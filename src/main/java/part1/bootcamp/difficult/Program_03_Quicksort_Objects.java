package part1.bootcamp.difficult;

import java.util.Arrays;

public class Program_03_Quicksort_Objects {
	
	// Write a program to sort an array of objects in Java using the quicksort algorithm.

	public static void main(String[] args) {
		
			Person[] persons = {
            new Person("Alice", 25),
            new Person("Bob", 20),
            new Person("Charlie", 30),
            new Person("David", 18),
            new Person("Eve", 35)
        };

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(persons));

        // Sort the array using quicksort based on age
        quickSort(persons, 0, persons.length - 1);

        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(persons));

	}
	
	
	// Quicksort algorithm for sorting Person objects based on age
    public static void quickSort(Person[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // Pick the pivot (middle element)
        int middle = low + (high - low) / 2;
        int pivotAge = arr[middle].getAge();

        // Make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].getAge() < pivotAge) {
                i++;
            }

            while (arr[j].getAge() > pivotAge) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Recursively sort two sub-parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

    // Utility method to swap two elements in an array
    private static void swap(Person[] arr, int i, int j) {
    	Person temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	

}
