/* John wants to know how to calculate the subject marks.could you please help him to learn marks calculation in programming.

Input Format

First input consists of String
Second input consists of integer
Third input consists of integer
Fourth input consists of integer
Fifth input consists of integer
Sixth input consists of integer
Constraints

No Constraints

Output Format

Execute the total and Average Marks.
Sample Input 0

John
100
99
100
100
99
Sample Output 0

Name of the Student:John
Total marks:498
Average marks:99.6 */

//Code

import java.util.*;


public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int total = num1+num2+num3+num4+num5;
        System.out.print("Name of the Student:"+str);
        System.out.print("\nTotal marks:"+total);
        System.out.print("\nAverage marks:"+(total/5.0));
        sc.close();
    }
}
