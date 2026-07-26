/* Write a program to create a new array from a given array with the elements divisible by a specific number and count the number of elements divisible by a specific number in an array and find the sum of value divisible by a specific number in an array .

Input Format

First input consist of array size Second input consist of array elements. Third inpust consist of Divisor for an array elements.

Constraints

No Constraints

Output Format

Find the elements which is divisible by a specific number. Count the number of elements divisible by a specific number. find the sum of value divisible by a specific number in an array.

Sample Input 0

6
23 45 11 20 12 17
5
Sample Output 0

The elements that are divisible by 5 is 45 20
The Count of the value that is divisible by 5 is 2
The Sum of value that is divisible by 5 is 65
Sample Input 1

4
6 7 9 2
3
Sample Output 1

The elements that are divisible by 3 is 6 9
The Count of the value that is divisible by 3 is 2
The Sum of value that is divisible by 3 is 15 */

//Code


import java.util.*;


public class Divisiblebyspecifiednumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int divisor = sc.nextInt();
        int count=0;
        int sum=0;
        System.out.print("The elements that are divisible by " + divisor + " is ");

        for (int i=0;i<n;i++) {
            if (arr[i]%divisor==0) {
                System.out.print(arr[i] + " ");
                count++;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("The Count of the value that is divisible by " + divisor + " is " + count);
        System.out.println("The Sum of value that is divisible by " + divisor + " is " + sum);
        sc.close();
    }
}
