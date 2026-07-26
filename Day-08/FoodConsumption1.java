/* The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null Return 0 if the total amount of food from all houses is not sufficient for all the rats. Computed values lie within the integer range.

Explanation: Total amount of food required for all rats = r * unit

= 7 * 2 = 14.

The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.

Input Format

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Constraints

No Constrains

Output Format

Output:

4

Sample Input 0

7
4
10
6 4 3 2 1 5 7 4 3 8
Sample Output 0

Amount of food in 1st 7 houses is sufficient for all the rats
Sample Input 1

4
2
5
1 1 0 1 1
Sample Output 1

0 */

//Code

import java.util.*;

public class FoodConsumption1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int u = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = r*u;
        int s = 0;
        int c = 0;
        for (int i=0;i<n;i++){
            s+=arr[i];
            if(s>=t){
                c=i+1;
                break;
            }
        }
        if (c==0){
            System.out.print(0);
        } else {
            System.out.print("Amount of food in 1st "+c+" houses is sufficient for all the rats");
        }
        sc.close();
    }
}
