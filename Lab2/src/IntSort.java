import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Note that an array of integers are expected
 * 
 * Remember to site sources if you use code from online!
 */
public class IntSort {

	//you may use this to check that your test cases are correct
    public static int[] sort(int[] arr){
    	int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        return arrCopy; 
    }

    public static int[] InsertionSort(int[] orgArr){
        //TODO: implement insertion sort as described at https://en.wikipedia.org/wiki/Insertion_sort
    	int[] arr = orgArr.clone();
    	//The Following code is copied from https://www.geeksforgeeks.org/insertion-sort-algorithm/
    	 int n = arr.length;
         for (int i = 1; i < n; ++i) {
             int num = arr[i];
             int j = i - 1;

             /* Move elements of arr[0..i-1], that are
                greater than key, to one position ahead
                of their current position */
             while (j >= 0 && arr[j] > num) {
                 arr[j + 1] = arr[j];
                 j = j - 1;
             }
             arr[j + 1] = num;
         }
    	// SORT HERE //
    	
    	// return arr sorted
        return arr;
    }
    
    // assumes values in array range from [0,numBuckets]
    public static int[] CountingSort(int[] array){
    //TODO: implement counting sort as described at any of the following links:
	//http://www.personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/Sorting/countingSort.htm
	//https://en.wikipedia.org/wiki/Counting_sort
    	int[] inputArray = array.clone();
    		//The Following code is copied from https://www.geeksforgeeks.org/counting-sort/
    	   int N = inputArray.length;
           int M = 0;

           for (int i = 0; i < N; i++) {
               M = Math.max(M, inputArray[i]);
           }

           int[] countArray = new int[M + 1];

           for (int i = 0; i < N; i++) {
               countArray[inputArray[i]]++;
           }

           for (int i = 1; i <= M; i++) {
               countArray[i] += countArray[i - 1];
           }

           int[] outputArray = new int[N];

           for (int i = N - 1; i >= 0; i--) {
               outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
               countArray[inputArray[i]]--;
           }

           return outputArray;
    	// Ensure not to alter the original array
    }
    //Data structure and sorting algorithms are visualized at https://cmps-people.ok.ubc.ca/ylucet/DS/Algorithms.html
	//in particular see insertion and counting sort

}
