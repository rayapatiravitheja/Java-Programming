/*Write a program to execute the datas with the statement.

Input Format

first input corresponds to integer
second input corresponds to float
third input corresponds to char
fourth input correspond to string
fifth input correspond to String
Constraints

No Constraints

Output Format

execute the user inputs with the statemets
Sample Input 0

23
45.56
A
hello
hello world

Sample Output 0

Integer is 23
Float is 45.56
Character is A
Strings are hello and hello world */

// Code

import java.util.*;


public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float num2 = sc.nextFloat();
        char ch = sc.next().charAt(0);

        sc.nextLine();

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Integer is " + num);
        System.out.println("Float is " + num2);
        System.out.println("Character is " + ch);
        System.out.println("Strings are " + str1 + " and " + str2);

        sc.close();
    }
}