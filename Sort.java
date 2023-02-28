import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    static void printArray(int[] arr){
        for (int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }

    // Video 37
    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void BubbleSort_Video(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void BubbleSort_Optimised(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    // Bubble sort is an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
    // Bubble sort is a stable sorting algorithm. A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
    // Finish Video 37

    // Video 38
    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        // Selection sort is an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
        // Selection sort is NOT a stable sorting algorithm. A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
        /* Example -->
        [4,10,4',2] <-- Original Array
        [2,10,4',4] <-- Iteration 1
        [2,4',10,4] <-- Iteration 2
        [2,4',4,10] <-- Iteration 3
        [2,4',4,10] <-- Final Array
        */
    }
    // Finish Video 38

    // Video 39
    static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
        }
        // Insertion sort is an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
        // Insertion sort is a stable sorting algorithm. A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
        // Insertion sort is really good when less there is less no. of element or the array is partially sorted.
    }
    // Finish Video 39

    // Video 40
    static void move_zero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void lexicographicalOrder(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    // Finish Video 40

    // Video 41
    static void merge(int[] arr, int start, int mid, int end) {
        int[] left = new int[mid - start];
        int[] right = new int[end - mid];
        int k = 0;
        for (int i = start; i < mid; i++)
            left[k++] = arr[i];
        k = 0;
        for (int i = mid; i < end; i++)
            right[k++] = arr[i];
        k = start;
        int i = 0;
        int j = 0;
        while (i != left.length && j != right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i != left.length)
            arr[k++] = left[i++];
        while (j != right.length)
            arr[k++] = right[j++];

    }

    static void MergeSort(int[] arr, int start, int end) {
        if (end - start <= 1)
            return;
        int mid = (start + end) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    // Time Complexity is O(n*logn)
    // Merge sort's time complexity for best, average and worst case is same i.e. (n*logn)
    // Space Complexity is O(n+logn) i.e. O(n)
    // Merge sort is not an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
    // Merge sort is a stable sorting algorithm(When equality sign is there in "left[i]<=right[j]"). A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
    // Finish Video 41

    // Video 42
    static int partition(int[] arr, int start, int end) {
        int pivotIndex = start;
        for (int i = start; i <= end; i++)
            if (arr[i] < arr[start])
                pivotIndex++;
        int temp = arr[start];
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i = start, j = end;
        while (i < pivotIndex && pivotIndex < j) {
            if (!(arr[i] >= arr[pivotIndex]))
                i++;
            if (!(arr[pivotIndex] >= arr[j]))
                j--;
            if ((arr[i] >= arr[pivotIndex]) && (arr[pivotIndex] >= arr[j])) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
    static void QuickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int pivotIndex = partition(arr, start, end);
        QuickSort(arr, start, pivotIndex - 1);
        QuickSort(arr, pivotIndex + 1, end);
    }


    static int partition_Video(int[] arr, int start, int end){
        int pivotIndex = start;
        for(int i=start+1; i<=end; i++)// Don't compare it with element at 'start' index cause on the counter starts from there. On doing this if the first element is biggest, it will throw out of bound error
            if(arr[i] <= arr[start])
                pivotIndex++;
        int temp = arr[start];
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i=start, j=end;
        while(i < pivotIndex && pivotIndex < j){
            while(arr[i] <= arr[pivotIndex])
                i++;
            while(arr[pivotIndex] < arr[j])
                j--;
            if(i < pivotIndex && pivotIndex < j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
    static void QuickSort_Video(int[] arr, int start, int end){
        if(start>=end)
            return;
        int pivotIndex = partition_Video(arr, start, end);
        QuickSort_Video(arr, start, pivotIndex-1);
        QuickSort_Video(arr, pivotIndex+1, end);
    }

    // Quick sort is in-place algorithm
    // Quick sort is not a stable sorting algorithm. The duplicates are always kept on left side, so order can be messed up when 2 or more duplicate elements are there

    // Time complexity for best case is nlogn. This is the case when the array is divided equally/balancedly. Example - When pivot lies in middle
    // Time complexity for worst case is n^2. This is the case when array is divided unequally/unbalancedly. Example - When pivot lies at position of the element whose location is to be found in the array. Like sorted array.
    // Time complexity for average case is nlogn. It is found by taking average of time complexity of all possible partitions.

    // Worst case of Quick Sort can be EASILY AVOIDED by not taking 1st element as pivot but a random element as pivot.

    // Space complexity for best/average case is logn. Since n/2^k=1 is the max number of stack frames as S(n/2^k) = S(1) = constant space.
    // Space complexity for worst case is n. Since n is the max number of stack frames. But this can also be easily avoided by using the above technique of randomising element which will become pivot

    // Quick Sort is considered to be in-place algorithm because logn is so less for every practical value that it is negligible. But if we don't take stack space in consideration then it space complexity is O(1).

    // Finish Video 42

    // Video 43
    static void CountSort(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i] > max)
                max = arr[i];

        int[] frequency = new int[max+1];
        for(int i=0;i<arr.length;i++)
            frequency[arr[i]]++;

        int k=0;
        for(int i = 0; i< frequency.length; i++)
            for(int j = 1; j<= frequency[i]; j++)
                arr[k++] = i;
    }
    static void CountSort_Stable(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i] > max)
                max = arr[i];

        int[] frequency = new int[max+1];
        for(int i=0;i<arr.length;i++)
            frequency[arr[i]]++;

        for(int i = 1; i< frequency.length; i++)
            frequency[i] += frequency[i-1];

        int[] output = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            int element = arr[i];
            int lastIndex = frequency[element]-1;
            output[lastIndex] = arr[i];
            frequency[element]--;
        }

        for(int i=0; i<arr.length; i++)
            arr[i] = output[i];
    }
    // Count Sort is best when the use case is that we have to sort numbers that are within a given range of numbers.
    // Time Complexity is (n+max). This will perform bad when max is too big. It is best when range is small.
    // Space Complexity is (n+max).


    static int digitFinder(int number, int position){
//        if(position==1)
//            return (int) (number % Math.pow(10, position));
//        else
//            return (int) (((number % Math.pow(10, position)) - (number % Math.pow(10, position-1))) / Math.pow(10, position-1));
        return (int) ((number / Math.pow(10, position-1)) % 10); // As position will be 1 when need to find first element
    }
    static void RadixSort(int[] arr){
        int outer_max =0;
        for(int i=0; i<arr.length; i++)
            if(arr[i] > outer_max)
                outer_max = arr[i];
        // TC -> (n)

        // TC -> (d)
        for(int control = outer_max, position = 1; control!=0; control/=10, position++){
            // No need to find max as we know there is only one digit and 9 is the max one-digit number. So array size will be 10.

            int[] frequency = new int[10]; // SC -> 10
            for(int i=0; i<arr.length; i++) {
                int digit = digitFinder(arr[i], position);
                frequency[digit]++;
            }
            // TC -> n

            for(int i=1; i<frequency.length; i++)
                frequency[i] += frequency[i-1];
            // TC -> max digit -> 10 as last digit can be no more than 9

            int[] output = new int[arr.length]; // SC -> n
            for(int i=arr.length-1; i>=0; i--) {
                int digit = digitFinder(arr[i], position);
                int lastIndex = frequency[digit] - 1;
                output[lastIndex] = arr[i];
                frequency[digit]--;
            }

            for(int i=0; i<arr.length; i++)
                arr[i] = output[i];
        }
        // Time Complexity of Radix Sort is d(n+k)+n = d(n)+n
        // Space Complexity of Radix Sort is n+10 = n
        // Count Sort is used in this, therefore this is not also in-place
    }


    static void BucketSort(float[] arr){
        // No need to find max number as the one-digit will be no more than 9. Hence, the size of array will be 10.
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];
        for(int i=0; i<buckets.length; i++)
            buckets[i] = new ArrayList<Float>();
        // TC -> n

        for(int i=0; i<arr.length; i++)
            buckets[(int) (arr[i]*n)].add(arr[i]);

        for(int i=0; i<buckets.length; i++)
            Collections.sort(buckets[i]); // TC -> nlogn

        int index=0;
        for(int i=0; i<buckets.length; i++)
            for(int j=0; j<buckets[i].size(); j++)
                arr[index++] = buckets[i].get(j);

        // WARNING: Bucket Sort is not a sorting algorithm but a concept. The implementation of sorting algorithm will be different depending on the kind of problem.
        // Time Complexity will be n+k(nlogn) where k is no. of buckets.
        // For best case, where elements are uniformly distributed among the buckets. nlogn will be very less. So Time Complexity will be n+k.
        // For worst case, where elements are concentrated into one bucket. k will be 1. So Time Complexity will be n+nlogn.
    }
    // Finish Video 43


    public static void main(String[] args) {

    }
}
