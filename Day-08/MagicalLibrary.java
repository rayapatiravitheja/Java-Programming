/*In a magical library, each bookshelf is represented by a two-dimensional array A, where each row of the 2D array A[i] represents the series value of a book.Buy bestselling books online

A row is considered magical if the sum of the odd values of the series of a book is even. Your task is to find and return an integer value representing the number of magical rows.

Example 1:

    input1: 3
    input2: 3
    input3: ((1, 2, 3), (4, 5, 6), (7, 8, 9))
    Output: 2
    Buy bestselling books online

    Explanation: Here, the given 2D array is {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}

    In the first row {1, 2, 3} the odd numbers are {1, 3} and their sum is 4 which is even.
    In the second row {4, 5, 6} the odd numbers are {5} and as there is only one odd element so the sum is 5 which is odd.
    In the third row {7, 8, 9} the odd numbers are {7, 9} and their sum is 16 which is even.
    Therefore, there are only 2 magical rows so, 2 is returned as the output.
Example 2:

    input1: 3
    input2: 2
    input3: {{2, 4}, {0, 0}, {11, 11}}
    Output: 1
    Explanation: Here, the given 2D given array {{2, 4}, {0, 0}, {11, 11}}, Only the last row {11, 11} has odd elements and their sum is 22 which is even. Therefore, there is only 1 magical row so, 1 is returned as the output.
Input Format

Input Specification:

input1: An integer value representing the number of rows in the 2D array.
input2: An integer value representing the number of columns in the 2D array.
input3: A 2D integer array where each row represents a series of books.
Constraints

NO Constraints

Output Format

Output Specification: - Return an integer value representing the number of magical rows.

Sample Input 0

3  
3    
1 2 3  
4 5 6  
7 8 9 
Sample Output 0

2
Sample Input 1

2
2
7 9  
2 2  
Sample Output 1

1 */
//Code
import java.util.*;

public class MagicalLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int count = 0;
        for (int i=0;i<rows;i++) {
            int oddSum = 0;
            for (int j=0;j<cols;j++) {
                int num=sc.nextInt();
                if (num%2!=0) {
                    oddSum+=num;
                }
            }
            if (oddSum!=0&&oddSum%2==0) {
                count++;
            }
        }
        System.out.println(count);
    sc.close();
    }
}

