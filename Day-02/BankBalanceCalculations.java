/* Imagine that you are managing a simple bank account, and you need to calculate the balance after a deposit and a withdrawal. Write a program in C language that takes the initial balance, the amount to deposit, and the amount to withdraw as inputs from the user, and then calculates and displays the final balance.

Input Format

First input is an intial balance
Second inpiut is the deposit amount
third input is the withdrwal amount
Constraints

No constraints

Output Format

Execute the final bank balance.
Sample Input 0

750 0 250
Sample Output 0

Your final balance is: $500
Sample Input 1

0 500 200
Sample Output 1

Your final balance is: $300 */

//Code

import java.util.*;

public class BankBalanceCalculations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int d = sc.nextInt();
        int w = sc.nextInt();
        int f = i+d-w;
        System.out.println("Your final balance is: $"+f);
        sc.close();
    }
}

