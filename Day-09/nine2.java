/*Write a program to find the sum of Zig-Zag pattern in a given matrix.

Input Format

Input consists of 2 integers and 1 2D-array.
first input correspond to the size of rows and columns.
second input correspond to the array elements.
Constraints

No Constraints

Output Format

print the sum of zig zag value.
Sample Input 0

3
3
1 2 3
4 5 6
7 8 9
Sample Output 0

Sum of Zig-Zag pattern is 35
Sample Input 1

2
2
1 1
1 2
Sample Output 1

Sum of Zig-Zag pattern is 5 */
import java.util.Scanner;

public class nine2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int j = 0; j < col; j++) {
            sum += arr[0][j];
        }
        for (int i = 1; i < row-1; i++) {
            sum += arr[i][col - 1-i];
        }
        if (row > 1) {
            for (int j = 0; j < col; j++) {
                sum += arr[row - 1][j];
            }
        }
        System.out.println("Sum of Zig-Zag pattern is " + sum);
    }
}
