
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


    public static void main(String[] args) {

    }
}
