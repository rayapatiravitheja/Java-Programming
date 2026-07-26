/* A customer support company maintains the weekly shift schedule of its employees in an array. To ensure fair distribution of responsibilities, the schedule is rotated by K positions at the beginning of every week. Employees who reach the end of the schedule continue from the beginning, maintaining the same relative order. Since the company manages thousands of employees across multiple branches, the rotation must be performed efficiently. Your task is to update the shift schedule after rotating it by K positions to the right.

Given an array of integers and an integer K, rotate the array to the right by K positions.

Note: If K is greater than the size of the array, consider K = K % N.
Input Format

The first line contains an integer N, representing the number of elements in the array.
The second line contains N space-separated integers.
The third line contains an integer K, representing the number of positions to rotate.
Constraints

1 ≤ N ≤ 10^5
0 ≤ K ≤ 10^9
-10^9 ≤ A[i] ≤ 10^9
Output Format

Print the array after rotating it to the right by K positions.
Sample Input 0

4
100 200 300 400
0
Sample Output 0

100 200 300 400
Sample Input 1

6
10 20 30 40 50 60
2
Sample Output 1

50 60 10 20 30 40 */

//Code

import java.util.*;

public class RotateArray90 {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (n > 0) {
            k = k % n;
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    sc.close();
    }
}
