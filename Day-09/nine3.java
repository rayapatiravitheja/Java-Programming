/*Write a program to execute the transpose of the given 2D matrix.

Input Format

first input consists of array size(row and column)
second input consists of array elements.
Constraints

No Constraint

Output Format

Execute the transpose of the given matrix

Sample Input 0

3
1
2
3
4
5
6
7
8
9
Sample Output 0

Array elements are:
1 2 3
4 5 6
7 8 9
Transpose matrix is:
1 4 7
2 5 8
3 6 9 */
import java.util.Scanner;

public class nine3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
