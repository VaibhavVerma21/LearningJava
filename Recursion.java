
public class Recursion {

    // Video 27
    static void printFirstNaturalNos_Increasing(int n){
        if(n!=1) printFirstNaturalNos_Increasing(n-1);
        System.out.print(n + " ");
    }
    static void printFirstNaturalNos_Decreasing(int n){
        System.out.print(n + " ");
        if(n!=1) printFirstNaturalNos_Decreasing(n-1);
    }
    // Finish Video 27

    // Video 28
    static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    static int fibonacciSeries(int n){
        if(n==0 || n==1) {
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
    // Finish Video 28

    // Video 29
    static int SumOfDigits(int n){
//        if(n==0) return 0; // Adds another layer to the stack increasing space and time complexity
        if(n>=0 && n<=9) return n;
        return SumOfDigits(n/10) + n%10;
    }
    static int CountOfDigits(int n){
        if(n>=0 && n<=9) return 1;
        return CountOfDigits(n/10) + 1;
    }
    static int Pow(int p, int q){
        if(q==0) return 1;
        return Pow(p, q-1) * p;
    }
    static int Pow_Better(int p, int q){
        if(q==0) return 1;
        int half=Pow_Better(p, q/2);
        if(q%2==0) return half*half;
        return half*half*p;
    }
    // Finish Video 29

    // Video 30
    static void multiple(int num, int k){
//        if(k==0) return;
        if(k==1) {
            System.out.println(num);
            return;
        }
        multiple(num, k-1);
        System.out.println(num*k);
    }
    static int SumOfFirstNNaturalNos(int n){
        if(n==0) return n;
        return SumOfFirstNNaturalNos(n-1) + n;
    }
    static int SumOfFirstNNaturalNos_AlternativeSign(int n){
        if(n==0) return n;
        if(n%2==0)
            return SumOfFirstNNaturalNos_AlternativeSign(n-1) - n;
        else
            return SumOfFirstNNaturalNos_AlternativeSign(n-1) + n;
    }
    // Finish Video 30

    // Video 31
    static int GCD_BruteForce(int a, int b){
        int GCD = 1;
        // ok
//        for(int i=2; i<=Math.min(a,b); i++)
//          if(a%i==0 && b%i==0) GCD = i;
        //better
        for(int i=Math.min(a,b); i>=2; i--)
            if(a%i==0 && b%i==0)
                return i;
        return GCD;
    }
    static int GCD_Better(int x, int y){
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
        // Long Division Method
    }
    static int GCD_Recursion(int x, int y){
        if(y==0) return x;
//        if(x==0) return y; // no need because y can't really be 0 if you think about it since x%y will give an error
        return GCD_Recursion(y, x%y);
        /*
        GCD(x,y) = GCD(y,x%y)
        GCD(x,0) = x
        euclidean algorithm
         */
    }
    // LCM * GCD = x * y
    // Finish Video 31

    // Video 32
    static void printArray(int[] arr, int index){
        if(index==0){
            System.out.println(arr[0]);
            return;
        }
        printArray(arr, index-1);
        System.out.println(arr[index]);
        //prints from start to a certain element
    }
    static void printArray_Video(int[] arr, int startIndex){
        if(startIndex==arr.length-1){
            System.out.println(arr[startIndex]);
            return;
        } // or if(index==arr.length)return;
        System.out.println(arr[startIndex]);
        printArray_Video(arr, startIndex+1);
        // prints from a start index to the end
    }
    static int MaxValueInArray(int[] arr, int startIndex) {
        if(startIndex==arr.length-1)
            return arr[startIndex];
        int k = MaxValueInArray(arr, startIndex+1);
        return Math.max(k, arr[startIndex]);
    }
    static int SumOfElementOfArray(int[] arr, int startIndex) {
        if(startIndex==arr.length-1)
            return arr[startIndex];
        return SumOfElementOfArray(arr, startIndex+1) + arr[startIndex];
    }
    // Finish Video 32


    public static void main(String[] args) {

    }
}
