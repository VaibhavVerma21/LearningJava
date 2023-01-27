
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


    public static void main(String[] args) {

    }
}
