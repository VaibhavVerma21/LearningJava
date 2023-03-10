// This file contains the solution/attempt of problems assigned to us in the lecture without a solution as an extra problem

public class Practice_Video {

    // Video 31
    static int Armstrong_Recursion(int n){
        if(n==0) return 0;
        return Armstrong_Recursion(n/10) + (int)Math.pow(n%10, 3);
    }
    static int Multiplication_Recursion(int x, int y){
        if(y==1) return x;
        return Multiplication_Recursion(x, y-1) + x;
    }
    // Finish Video 31

    // Video 33
    static boolean isSortedArray_Recursion(int[] arr, int i){
        if(i==arr.length-1)
            return true;
        if(arr[i] < arr[i+1])
            return isSortedArray_Recursion(arr, i+1);
        else
            return false;
    }
    static int lastIndex_Recursion(int[] arr, int x, int i){
        if(i == arr.length)
            return -1;
        int lastIndex = lastIndex_Recursion(arr, x, i+1);
        if(arr[i]==x && i>lastIndex)
            return i;
        else
            return lastIndex;
    }
    static int lastIndex_ReverseTraverse_Recursion(int[] arr, int x, int i){
        i-=1; //pass i as arr.length
        if(i==-1)
            return -1;
        if(arr[i]==x)
            return i;
        return lastIndex_ReverseTraverse_Recursion(arr, x, i-1);
    }
    // Finish Video 33

    // Video 34
    static boolean isIntegerPalindrome(int n, int digits, int one){
        // This question took me some time/frustration/patience to solve. But I finally did it. I was making little silly mistakes which were hard to figure out without debugger
        if(one>=digits) return true;
        int left = ((int)(n/Math.pow(10, digits-1))%10);
        int right = (int)(n%Math.pow(10, one)/(Math.pow(10, one-1)));
        return left==right && isIntegerPalindrome(n, digits-1, one+1 );
    }
    static boolean isIntegerPalindrome_Better_ButUseslog10(int n){
        if(n<10) return true;
        // Used chatGPT and came to know the way to get the no. of digit is Math.log10(n) +1
        int digits = (int)Math.log10(n)+1;
        boolean check = (int)(n/Math.pow(10, digits-1)) == n%10;
        int newDigit = (int)(n%Math.pow(10, digits-1))%10;
        return check && isIntegerPalindrome_Better_ButUseslog10(newDigit);
    }
    // Finish Video 34

    // Video 45
    static int lastOccurrence(int[] arr, int target){
        int index=-1;
        int low=0, high =arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target) {
                index = mid;
                low = mid+1;
            }
            else if(arr[mid] > target)
                high = mid - 1;
            else if(arr[mid] < target)
                low = mid + 1;
        }
        return index;
    }
    static double squareRootFinder_QPrecision(int num, int q){
        double low=0, high=num;
        double mid = 0;
        double ans = -1;
        double variation = Math.pow(0.1, q);
        while(low<=high) {
            mid = low + (high - low) / 2;
            if(mid*mid==num)
                return mid;
            else if(mid*mid>num)
                high = mid - variation;
            else {
                low = mid + variation;
                ans = mid;
            }
        }
        return (int) (ans/variation) * variation;
    }
    static double squareRootFinder_QPrecision_Solution(int num, int q) {
        int low = 0, high = num;
        int mid;
        double ans = 0.0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid == num) {
                ans = mid;
                break;
            }
            else if (mid * mid < num) {
                low = mid + 1;
                ans = mid;
            }
            else
                high = mid - 1;
        }

        double increment = 0.1;
        for (int i = 0; i < q; i++) {
            while (ans * ans <= num) {
                ans += increment;
            }
            ans = ans - increment;
            increment = increment / 10;
        }
        return ans;
    }
    // Finish Video 45


    public static void main(String[] args) {

    }
}
