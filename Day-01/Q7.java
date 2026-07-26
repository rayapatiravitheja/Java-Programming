/* sila wants to know how the Arithmetic operators are performing in programming.could you please help her to learn the Arithmetic calculation.

Input Format

First input consist of integer
second input consist of integer
Constraints

No Constraints

Output Format

execute the Arithmetic calculation values.
Sample Input 0

45
7
Sample Output 0

Addition=52
Subtraction=38
Multiplication=315
Division=6
Modulo=3 */

//Code


import java.util.*;
public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Addition="+(num1+num2));
        System.out.print("\nSubtraction="+(num1-num2));
        System.out.print("\nMultiplication="+(num1*num2));
        System.out.print("\nDivision="+(num1/num2));
        System.out.print("\nModulo="+(num1%num2));
        sc.close();
    }
}
