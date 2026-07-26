/* Guna wants to know how to find whether the given values is positive or Negative.could you please help him to find the num type implements in programming

Input Format

one integer
Constraints

No Constraints

Output Format

if the given num is 5,execute the statement is Positive
if the given num is -5,execute the statement is Negative
if the given num is 0,execute the statement is Zero.
Sample Input 0

7
Sample Output 0

The Given Number 7 is Positive.
Sample Input 1

-7
Sample Output 1

The Given Number -7 is Negative.
Sample Input 2

0
Sample Output 2

The Given Number 0 is Zero. */

//Code

import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("The Given Number " + num + " is Positive.");
        } else if (num < 0) {
            System.out.println("The Given Number " + num + " is Negative.");
        } else {
            System.out.println("The Given Number " + num + " is Zero.");
        }
        
        sc.close();
    }
}