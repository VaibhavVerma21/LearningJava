public class BinarySearch {
    static void printArray(int[] arr){
        for (int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }


    // Video 45
    static boolean binarySearch(int[] arr, int target){
        int low=0, high =arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                high = mid - 1;
            else if(arr[mid] < target)
                low = mid + 1;
        }
        return false;
    }
    static boolean binarySearch_Recursion(int[] arr, int low, int high, int target){
        if(low > high) return false;
        int mid = low+(high-low)/2;
        if(arr[mid] == target)
            return true;
        else if(arr[mid] > target)
            return binarySearch_Recursion(arr, low, mid-1, target);
        else
            return binarySearch_Recursion(arr, mid+1, high, target);
    }
    // In binary sort, when finding mid, if the low+high integer crosses the integer limit, it will throw an error and hence it is never used. A better way to avoid error is to find mid from low+(high-low)/2 as it will return the same thing.
    // Time Complexity of Binary Search is logn. It's Space Complexity is 1 for loop method and logn for recursive method.

    static int firstOccurrence(int[] arr, int target){
        int index=-1;
        int low=0, high =arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target) {
                index = mid;
                break;
            }
            else if(arr[mid] > target)
                high = mid - 1;
            else if(arr[mid] < target)
                low = mid + 1;
        }
        if(index==0) return index;
        while(index>0 && arr[index]==arr[index-1]) index--;
        return index;
    }
    static int firstOccurrence_Video(int[] arr, int target){
        int index=-1;
        int low=0, high =arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target) {
                index = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
                high = mid - 1;
            else if(arr[mid] < target)
                low = mid + 1;
        }
        return index;
    }

    static int squareRootFinder(int num){
        int low=0, high=num;
        int mid = 0;
        while(low<=high) {
            mid = low + (high - low) / 2;
            if(mid*mid==num)
                return mid;
            else if(mid*mid>num)
                high = mid - 1;
            else
                low = mid + 1;
        }
        if(mid*mid>num)
            return mid - 1;
        else
            return mid;
    }
    static int squareRootFinder_Video(int num){
        int low=0, high=num;
        int mid = 0;
        int ans = -1;
        while(low<=high) {
            mid = low + (high - low) / 2;
            if(mid*mid==num)
                return mid;
            else if(mid*mid>num)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    // Finish Video 45


    public static void main(String[] args) {

    }
}
