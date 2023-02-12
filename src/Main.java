/*
Question : Given a square matrix, turn it by 90 degrees in anticlockwise direction without using extra spaces.
 */
import java.util.Scanner;
public class Main {
    static void AntiClockWise(int[][] ans){
        System.out.println("Finally, printing the result 90 degrees anticlockwise :");
        for (int i = ans.length-1; i >= 0; i--){
            for (int j = ans.length-1; j >= 0; j--){
                System.out.print(" " + ans[i][j]);
            }
            System.out.println();
        }
    }
    static void transpose(int[][] matrix, int a, int b){
        if (a != b){
            System.out.println("Invalid, row and column enter by user :");
            return;
        }
        int[][] ans = new int[matrix.length][matrix.length];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(" " + ans[i][j]);
            }
            System.out.println();
        }
        AntiClockWise(ans);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row :");
        a = sc.nextInt();
        System.out.println("Enter the length or column :");
        b = sc.nextInt();
        System.out.println("Enter the value inside of matrix :");
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Firstly, printing the original value of matrix :");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Secondly, printing the transpose matrix :");
        System.out.println();
        transpose(arr,a,b);
    }
}