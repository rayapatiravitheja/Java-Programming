/* Write the program to replace all EVEN elements by 0 and Odd by 1 in One Dimensional Array.

Input Format

First input consists of array size and second input consist of array size.

Constraints

No Constraints.

Output Format

Replace all the even elements by 0 and replace all the odd elements by 1.

Sample Input 0

5
6 4 3 1 2
Sample Output 0

Before Replacement of value 0 and 1:6 4 3 1 2
After Replacement of value 0 and 1:0 0 1 1 0
Sample Input 1

4
8 4 3 2
Sample Output 1

Before Replacement of value 0 and 1:8 4 3 2
After Replacement of value 0 and 1:0 0 1 0 */

// Code 

import java.util.*;

public class Replaceoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Replacement of value 0 and 1:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.print("\nAfter Replacement of value 0 and 1:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
