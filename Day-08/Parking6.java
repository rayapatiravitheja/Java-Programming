/* A parking lot in a mall has RxC number of parking spaces. Each parking space will either be empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note : RxC- Size of the matrix Elements of the matrix M should be only 0 or 1.

Constraints: No Constraints

Example: Example 1: Input : 3 -> Value of R(row) 3 -> value of C(column) [0 1 0 1 1 0 1 1 1] Output : 3 -> Row 3 has a maximum number of 1’s

Example 2: input : 4 -> Value of R(row) 3 -> Value of C(column) [0 1 0 1 1 0 1 0 1 1 1 1] Output : 4 -> Row 4 has a maximum number of 1’s

Explanation: Input format:-

The first input corresponds to the array size of the row and column.

The second input corresponds to the array element.

Output format:-

Find the maximum of 1s presented in the row.

Input Format

Given in the problem statement

Constraints

No Constraints

Output Format

Given in the problem statement

Sample Input 0

3
3
0 1 0
1 1 1
0 1 1
Sample Output 0

Row 2 has maximum number of 1's
Sample Input 1

5
5
1 0 1 1 0
0 0 0 0 0
1 1 0 0 1
1 0 0 0 1
1 1 0 1 1
Sample Output 1

Row 5 has maximum number of 1's */

//Code

import java.util.*;
public class Parking6 {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int num = 0;
        for (int i=0;i<r;i++){
            int count=0;
            for (int j=0;j<c;j++){
                if (arr[i][j]==1){
                    count++;
                }
            }
            if(count>num){
                num=count;
                max=i+1;
            }
        }
        System.out.print("Row "+max+" has maximum number of 1's");
        sc.close();
    }
}
