/* The function accepts an integer sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of the array (arr[j] + arr[k] <= sum) and return the product of the element of this pair

NOTE

Return -1 if an array is empty or if n<2 Return 0, if no such pairs are found All computed values lie within the integer range

Constraints: No Constraints

Example: Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation: Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Input Format

Given in the problem statement

Constraints

No Constraints

Output Format

Given in the problem statement

Sample Input 0

7
5
4 3 2 3 4
Sample Output 0

6
Sample Input 1

7
5
7 3 6 9 5
Sample Output 1

0
Sample Input 2

7
1
7
Sample Output 2

-1 */

//Code

import java.util.*;
public class PairFinding1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if (n>=2){
            Arrays.sort(arr);
            int t = 0;
            for (int i=0;i<n;i++){
                t = arr[0]*arr[1];
            }
            if (arr[0]+arr[1]>=s){
                System.out.print(0);
            } else {
                System.out.print(t);
            }
        } else {
            System.out.print(-1);
        }
        sc.close();
    }
}
