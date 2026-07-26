/* Sanjay wants to learn the calculation of integer digits.could you please help him to implements the sum of digits in programming. Notes:- - If the integer is 45,separate the each digits (4+5) the output is 9.

Input Format

input consists of one integer.
Constraints

Given N is greater than 9 and lesser than 99
Output Format

execute the sum of digits values. Notes:-
If the input is above 100, execute the statements is "Invalid Input".
Sample Input 0

23
Sample Output 0

Sum of Digit 23 is 005
Sample Input 1

56
Sample Output 1

Sum of Digit 56 is 011
Sample Input 2

100
Sample Output 2

Invalid Input */

//Code

import java.util.*;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (num > 99 || num < 10) {
            System.out.println("Invalid Input");
        } else {
            int first = num / 10;
            int last = num % 10;
            int sum = first + last;
            
            System.out.printf("Sum of Digit %d is %03d\n", num, sum);
        }
        
        sc.close();
    }
}