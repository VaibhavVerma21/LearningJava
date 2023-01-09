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


    public static void main(String[] args) {

    }
}
