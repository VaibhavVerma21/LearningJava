import java.util.Scanner;

public class MultiDimensionalArray {
    static int[][] input2Darray() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row of array");
        int r = scan.nextInt();
        System.out.println("Enter column of array");
        int c = scan.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter values");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = scan.nextInt();

        return arr;
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    static int[][] transposeArray(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    static void rotateBy90(int[][] arr) {
        arr = transposeArray(arr);
        for (int i = 0; i < arr.length; i++)
            arr[i] = reverseArray(arr[i]);
        printArray(arr);
    }

    static int[][] pascal_MyAttempt(int n) {
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
            }
        }
        return pascal;
    }

    static int[][] pascal_Video(int n) {
        int[][] pascal = new int[n][];
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
            }
        }
        return pascal;
    }


    static void printSpiral_MyAttempt(int[][] arr) {
        int leftColumn = 0, rightColumn = arr[0].length - 1;
        int topRow = 0, bottomRow = arr.length - 1;

        while (leftColumn <= rightColumn || topRow <= bottomRow) {

            for (int j = leftColumn; j <= rightColumn; j++)
                System.out.println(arr[topRow][j]);
            //topRow update

            for (int i = 1 + topRow; i <= bottomRow; i++)
                System.out.println(arr[i][rightColumn]);
            //rightColumn update

            for (int j = rightColumn - 1; j >= leftColumn; j--)
                System.out.println(arr[bottomRow][j]);
            //bottomRow update

            for (int i = bottomRow - 1; i >= topRow + 1; i--)
                System.out.println(arr[i][leftColumn]);
            //leftColumn update


            leftColumn++;
            rightColumn--;
            topRow++;
            bottomRow--;
        }
    }

    static void printSpiral_Video(int[][] arr) {
        int leftColumn = 0, rightColumn = arr[0].length - 1, topRow = 0, bottomRow = arr.length - 1;
        int totalElements = 0;

        while (totalElements < arr.length * arr[0].length) {

            for (int j = leftColumn; j <= rightColumn && totalElements < arr.length * arr[0].length; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            //topRow update
            topRow++;

            for (int i = topRow; i <= bottomRow && totalElements < arr.length * arr[0].length; i++) {
                System.out.print(arr[i][rightColumn] + " ");
                totalElements++;
            }
            //rightColumn update
            rightColumn--;

            for (int j = rightColumn; j >= leftColumn && totalElements < arr.length * arr[0].length; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            //bottomRow update
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElements < arr.length * arr[0].length; i--) {
                System.out.print(arr[i][leftColumn] + " ");
                totalElements++;
            }
            //leftColumn update
            leftColumn++;


        }
    }

    static int[][] makeSpiral(int n){
        int[][] arr= new int[n][n];
        int count=1;

        int leftColumn = 0, rightColumn = arr[0].length - 1, topRow = 0, bottomRow = arr.length - 1;

        while (count <= arr.length * arr[0].length) {

            for (int j = leftColumn; j <= rightColumn && count <= arr.length * arr[0].length; j++) {
                arr[topRow][j] = count++;
            }
            //topRow update
            topRow++;

            for (int i = topRow; i <= bottomRow && count <= arr.length * arr[0].length; i++) {
                arr[i][rightColumn] = count++;
            }
            //rightColumn update
            rightColumn--;

            for (int j = rightColumn; j >= leftColumn && count <= arr.length * arr[0].length; j--) {
                arr[bottomRow][j] = count++;
            }
            //bottomRow update
            bottomRow--;

            for (int i = bottomRow; i >= topRow && count <= arr.length * arr[0].length; i--) {
                arr[i][leftColumn] = count++;
            }
            //leftColumn update
            leftColumn++;


        }
        return arr;
    }
    


    public static void main(String[] args) {

         printArray(makeSpiral(3));

    }
}
