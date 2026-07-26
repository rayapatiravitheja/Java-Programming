/* Kumar wants to learn how the calculators are working.so he is trying to implements the calculator program.could you please help him to implements the program. - Notes:- Must use the Switch Case.operators - Addition - Subtraction - Multiplication - Division - Modulo

Input Format

First input consists of integer.
Second input consists of integer.
third input consists of character.
Constraints

No Constraints

Output Format

print the calculation Value.
if the symbol is not the arithmetic operator,print the statement is "Invalid Input".
Sample Input 0

3
4
+
Sample Output 0

Addition of two number is 7.0
Sample Input 1

7
3
-
Sample Output 1

Subtraction of two number is 4.0
Sample Input 2

13
2
/
Sample Output 2

Division of two number is 6.5 */

//Code

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        
        double result = 0;
        String operation = "";
        boolean valid = true;
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                operation = "Addition";
                break;
            case '-':
                result = num1 - num2;
                operation = "Subtraction";
                break;
            case '*':
                result = num1 * num2;
                operation = "Multiplication";
                break;
            case '/':
                result = (double) num1 / num2;
                operation = "Division";
                break;
            case '%':
                result = num1 % num2;
                operation = "Modulo";
                break;
            default:
                valid = false;
                System.out.println("Invalid Input");
        }
        
        if (valid) {
            System.out.println(operation + " of two number is " + result);
        }
        
        sc.close();
    }
}