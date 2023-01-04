// This file contains the solution/attempt of problems assigned to us in the lecture without a solution as an extra problem

public class Practice_Video {

    // Video 31
    static int Armstrong_Recursion(int n){
        if(n==0) return 0;
        return Armstrong_Recursion(n/10) + (int)Math.pow(n%10, 3);
    }
    static int Multiplication(int x, int y){
        if(y==1) return x;
        return Multiplication(x, y-1) + x;
    }
    // Finish Video 31


    public static void main(String[] args) {

    }
}
