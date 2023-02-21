
public class Sort {

    // Video 37
    static void BubbleSort(int[] arr){
        for(int i=0; i < arr.length-1; i++ ){
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void BubbleSort_Video(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void BubbleSort_Optimised(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    // Bubble sort is an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
    // Bubble sort is a stable sorting algorithm. A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
    // Finish Video 37

    // Video 38
    static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[j] < arr[min_index])
                    min_index=j;
            if(min_index!=i) {
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
    static void InsertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
    // Insertion sort is an in-place sorting algorithm. An in-place sorting algorithm is an algorithm that doesn't use extra space. Inputted array is edited
    // Insertion sort is a stable sorting algorithm. A stable sorting algorithm is an algorithm that doesn't change the order of same numbers.
    // Insertion sort is really good when less there is less no. of element or the array is partially sorted.
    }
    // Finish Video 39

    // Video 40
    static void move_zero(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j<arr.length-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                }
            }
        }
    }
    static void lexicographicalOrder(String[] arr){
        for(int i=0; i<arr.length; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[min_index]) < 0) {
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
    static void merge(int[] arr, int start, int mid, int end){
        int[] left = new int[mid-start];
        int[] right = new int[end-mid];
        int k=0;
        for(int i=start; i<mid; i++)
            left[k++] = arr[i];
        k=0;
        for(int i=mid; i<end; i++)
            right[k++] = arr[i];
        k=start;
        int i=0;
        int j=0;
        while(i!=left.length && j!= right.length){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i!=left.length)
            arr[k++] = left[i++];
        while(j!=right.length)
            arr[k++] = right[j++];

    }
    static void MergeSort(int[] arr, int start, int end){
        if(end-start<=1)
            return;
        int mid = (start + end)/2;
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


    public static void main(String[] args) {

    }
}
