/* A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.

Input Format

Inputs consist of angle1,angle2 and angle3.

Constraints

No Constraints

Output Format

Display the statement based on the testcase.

Sample Input 0

67
45
44
Sample Output 0

Triangle is not valid
Sample Input 1

49
50
81
Sample Output 1

Triangle is valid */

//Code

import java.util.*;

public class ValidTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        if (sum == 180) {
            System.out.print("Triangle is valid");
        } else {
            System.out.print("Triangle is not valid");
        }
        sc.close();
    }
}
