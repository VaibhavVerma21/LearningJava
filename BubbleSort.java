
public class BubbleSort {

    // Video 37
    static void bubbleSort(int[] arr){
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
    static void bubbleSort_Video(int[] arr){
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
    static void bubbleSort_Optimised(int[] arr){
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


    public static void main(String[] args) {

    }
}
