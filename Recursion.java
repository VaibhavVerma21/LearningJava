import java.util.ArrayList;

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

    // Video 33
    static boolean ifElementPresent(int[] arr, int x, int i){
        if(i==arr.length-1) {
            return arr[i] == x;
        }
        if(arr[i]==x)
            return true;
        else
            return ifElementPresent(arr, x, i+1);
    }
    static int findFirstIndexOfElement(int[] arr, int x, int i){
        if(i==arr.length) {
            return -1;
        }
        if(arr[i]==x)
            return i;
        else
            return findFirstIndexOfElement(arr, x, i+1);
    }
    static void findAllIndexOfElement(int[] arr, int x, int i){
        if(arr[i]==x)
            System.out.println(i);
        if(i != arr.length-1)
            findAllIndexOfElement(arr, x, i+1);
    }
    static void findAllIndexOfElement_ArrayList(int[] arr, int x, ArrayList<Integer> arrayList, int i){
        if(arr[i]==x)
            arrayList.add(i);
        if(i != arr.length-1)
            findAllIndexOfElement_ArrayList(arr, x, arrayList,i+1);
    }
    static ArrayList<Integer> findAllIndexOfElement_ArrayList_Video_TryWithHint(int[] arr, int x, int i){
        if(i == arr.length)
            return new ArrayList<Integer>();
        ArrayList<Integer> ans = findAllIndexOfElement_ArrayList_Video_TryWithHint(arr, x, i+1);
        if(arr[i] == x)
            ans.add(0, i);
        return ans;
    }
    static ArrayList<Integer> findAllIndexOfElement_ArrayList_Video_Solution(int[] arr, int x, int i){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(i == arr.length)
            return ans;
        if(arr[i] == x)
            ans.add(i);
        ArrayList<Integer> smallans = findAllIndexOfElement_ArrayList_Video_Solution(arr, x, i+1);
        ans.addAll(smallans);
        return ans; 
    }
    // Finish Video 33

    // Video 34
    static String RemoveAllCharacterOccurrence(String str, char c, int i){
        if(i==str.length())
            return "";
        if(str.charAt(i) == c)
            return RemoveAllCharacterOccurrence(str, c, i+1);
        else
            return str.charAt(i) + RemoveAllCharacterOccurrence(str, c, i+1);
        // Time Complexity of concatenation of strings depends on the length of the string. It is directly proportional to the length of the string.
        // Except the concatenation part in this function everything else is constant time.
        // But concatenation takes approx O(n) time. It is Linear in nature.
        // Time Complexity = no. of calls * time taken in one call
        // Hence, Time Complexity of this method is n * n = O(n^2)
    }
    static String RemoveAllCharacterOccurrence_ModifyingString_WorseTimeComplexity(String str, char c){
        if(str.length()==0)// "s".substring(1) will return "" not outofbound error but "s".substring(2) will return out of bound. i<=length
            return "";
        if(str.charAt(0) == c)
            return RemoveAllCharacterOccurrence_ModifyingString_WorseTimeComplexity(str.substring(1), c);
            // str.substring() is also not a constant time operation. It is linear i.e. O(n)
        else
            return str.charAt(0) + RemoveAllCharacterOccurrence_ModifyingString_WorseTimeComplexity(str.substring(1), c);
        // Concatenation takes approx O(n) time. It is Linear in nature.
        // Time Complexity = no. of calls * time taken in one call
        // Hence, Time Complexity of this method is n * 2n = O(2(n^2)) = O(n^2)
        // Looks like all operation on strings are not constant time  **********
    }
    static String ReverseString(String str){
        if(str.length()==0)
            return "";
        return ReverseString(str.substring(1)) + str.charAt(0); // O(n) time for one method call due to substring
    }
    static boolean isPalindromeString(String str){
        if(str.length()==1 || str.length()==0)
            return true;
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        /*
         Me thinking that this method will be faster because I thought in "(str.charAt(l) == str.charAt(r) && isPalindromeString_BetterTimeComplexity(str, l+1, r-1)"
         It will also call the method even if first and last character aren't same.
         But this is not the case as if(false && a==b) in this statement a==b will not be checked as the first part is already false
        */
        return isPalindromeString(str.substring(1, str.length()-1)); // Time complexity is O(n^2) and not O(n) because of substring
    }
    static boolean isPalindromeString_BetterTimeComplexity(String str, int l, int r){
        if(l>=r) return true;
        return (str.charAt(l) == str.charAt(r) && isPalindromeString_BetterTimeComplexity(str, l+1, r-1));
        /*
         Time Complexity is O(n) hence a better time complexity than my function design
         Index Method is better than substring Method as
         substring takes linear time (we are increasing our time complexity for no reason/advantage, waste of time)
        */
    }
    // Finish Video 34

    // Video 35
    // Revise it because it was a bit hard to me at first
    static ArrayList<String> subSequence_ArrayList(String s) {
        ArrayList<String> ans = new ArrayList<>();

        // base case
        if (s.equals("")) {
            ans.add("");
            return ans;
        }

        // recursion work
        ArrayList<String> smallAns = subSequence_ArrayList(s.substring(1));

        //self work
        char ch = s.charAt(0);
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(ch + ss);
        }
        return ans;
    }
    static void subSequence(String str, String answer) {
        if (str.equals("")) {
            System.out.print(answer + " ");
            return;
        }

        // first character of str does come
        subSequence(str.substring(1), answer + str.charAt(0));

        // first character of str doesn't come
        subSequence(str.substring(1), answer);


    }
    static void subSequence_Integer(int[] arr, int i, int answer) {
        if (i>=arr.length) {
            System.out.print(answer + " ");
            return;
        }

        // first character of str does come
        subSequence_Integer(arr, i+1, answer+arr[i]);

        // first character of str doesn't come
        subSequence_Integer(arr, i+1, answer);
    }
    // Finish Video 35

    // Video 36
    static int FrogProblem(int[] arr, int i){
        if(i==arr.length-1)
            return 0;
        if(i==arr.length-2)
            return Math.abs(arr[i] - arr[i+1]);

        int singleJump = Math.abs(arr[i] - arr[i+1]);
        int doubleJump = Math.abs(arr[i] - arr[i+2]);
        if(singleJump<doubleJump)
            return FrogProblem(arr, i+1) + singleJump;
        else
            return FrogProblem(arr, i+2) + doubleJump;
    }
    static int FrogProblem_Video(int[] arr, int i){
        if(i == (arr.length - 1))
            return 0;
        if (i == (arr.length - 2))
            return Math.abs(arr[i] - arr[i + 1]);

        int op1 = Math.abs(arr[i] - arr[i+1]) + FrogProblem_Video(arr, i+1);
        int op2 = Math.abs(arr[i] - arr[i+2]) + FrogProblem_Video(arr, i+2);
        return Math.min(op1, op2);
    }
    static void KeypadProblem(String digit, String answer){
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digit.length()==0) {
            System.out.print(answer + " ");
            return;
        }
        int keyNumber = digit.charAt(0) - '0';
        for(int i = 0; i < keypad[keyNumber].length(); i++) {
            KeypadProblem(digit.substring(1), answer + keypad[keyNumber].charAt(i));
        }
    }
    // Finish Video 36


    public static void main(String[] args) {

    }
}
