/* You are given the ArrayList. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → … Note: Execute the data same in ArrayList or LinkedList

Constraints: No Constraints

Explanation: No Explanation

Input Format

Example 1:

Input: List = [1,2,3,4] Output: [1,4,2,3]

Example 2:

Input: List = [1,2,3,4,5] Output: [1,5,2,4,3]

Constraints

No Constraints

Output Format

Execute in the given sample format

Sample Input 0

5
1 2 3 4 5
Sample Output 0

Reorder List is:
[1, 5, 2, 4, 3] */

//Code

import java.util.*;
public class ReorderList7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = new int[n];
        int start = 0;
        int end = n - 1;
        int index = 0;
        while (start <= end) {
            if (start == end) {
                result[index++] = arr[start];
            } else {
                result[index++] = arr[start];
                result[index++] = arr[end];
            }
            start++;
            end--;
        }
        System.out.println("Reorder List is:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
