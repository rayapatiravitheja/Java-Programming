/* Riya wants to find the greatest of three numbers.could you please help her to find the greatest of three numbers that implements in programming.

Input Format

Input consists of three integer.
Constraints

No Constraints

Output Format

print the greatest of three Number.
Sample Input 0

10
20
30
Sample Output 0

Number3 is maximum with value of 30.0
Sample Input 1

5
6
6
Sample Output 1

Number3 is maximum with value of 6.0
Sample Input 2

7
8
5
Sample Output 2

Number2 is maximum with value of 8.0 */

//Code

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number1 is maximum with value of " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number2 is maximum with value of " + num2);
        } else {
            System.out.println("Number3 is maximum with value of " + num3);
        }
        
        sc.close();
    }
}