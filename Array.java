import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static int[] inputArray(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter values");
        for(int i=0;i<arr.length;i++)
            arr[i]=scan.nextInt();

        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
    static void swapArray(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int findArraySum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];
        return sum;
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);






    }
}



























































/* Question asked
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)left++;
            if(arr[right]==1)right--;
        }
        printArray(arr);
 */