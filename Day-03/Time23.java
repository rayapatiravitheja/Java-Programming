/* On one fine Sunday, Sita and Radha decided to solve puzzles. Sita asked Radha to solve her puzzle. Sita gave the puzzle on time. She gave Radha the number of hours, number of minutes and number of seconds as input. With the given input, Radha should find out the total number of hours, the total number of minutes and the total number of seconds. Help Radha by writing a program for this. For example, the input given by Sita is 1, 70, 5. Now, 70 minutes is equal to 1 hour 10 minutes. So the output will be Total number of hour(s) is 2 Total number of minutes is 10 Total number of seconds is 5

Input Format

Input consists of three integers.
First input corresponds to the number of hours.
Second input corresponds to the number of minutes.
Third input corresponds to the number of seconds.
Constraints

No Constraints

Output Format

Execute the Time, Minutes and Second

Sample Input 0

1
15
10
Sample Output 0

Total Number of hours is 1
Total Number of minutes is 15
Total Number of seconds is 10
Sample Input 1

1
50
120
Sample Output 1

Total Number of hours is 1
Total Number of minutes is 52
Total Number of seconds is 0 */

//Code

import java.util.*;

public class Time23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        int sec = s%60;
        int finalseconds = s/60;
        
        int min = m+finalseconds;
        int minutes = min%60;
        int finalminutes = min/60;
        
        int hours = h+finalminutes;
        
        System.out.println("Total Number of hours is "+hours);
        System.out.println("Total Number of minutes is "+minutes);
        System.out.println("Total Number of seconds is "+sec);
        sc.close();
    }
}
