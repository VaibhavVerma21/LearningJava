
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


    public static void main(String[] args) {

    }
}
