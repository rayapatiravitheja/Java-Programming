/*Bela teaches her daughter to find the factors of a given number. When she provides a number to her daughter, she should tell the factors of that number. Help her to do this, by writing a program. Write a class FindFactor.java and write the main method in it.

Note :

If the input provided is negative, ignore the sign and provide the output. If the input is zero
If the input is zero the output should be “No Factors”.
Input Format

One Integer value

Constraints

No Constraints

Output Format

Execute the output in the single line format.

Sample Input 0

12  
Sample Output 0

1 2 3 4 6 12
Sample Input 1

0
Sample Output 1

No Factors  */

//Code

import java.util.*;
public class FindFactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("No Factors");
        } else {
            n = Math.abs(n);
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}