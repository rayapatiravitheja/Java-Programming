/* FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”. If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Input Format

Get input from the user for the no of students placed in the year.

Constraints

No constraints

Output Format

Find the highest placement record

Sample Input 0

102
90
77
Sample Output 0

Highest Placement:
CSE
Sample Input 1

0
0
0
Sample Output 1

None of the department has got the highest placement
Sample Input 2

65
56
65
Sample Output 2

Highest Placement:
CSE
MECH
Sample Input 3

45
-23
-12
Sample Output 3

Input is Invalid */

//Code

import java.util.*;

public class FOECollege {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cse = sc.nextInt();
        int ece = sc.nextInt();
        int mech = sc.nextInt();

        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is Invalid");
        } else if (cse > ece && cse > mech) {
            System.out.println("Highest Placement:");
            System.out.println("CSE");
        } else if (ece > cse && ece > mech) {
            System.out.println("Highest Placement:");
            System.out.println("ECE");
        } else if (mech > cse && mech > ece) {
            System.out.println("Highest Placement:");
            System.out.println("MECH");
        } else if (cse == ece && ece == mech) {
            System.out.println("None of the department has got the highest placement");
        } else {
            System.out.println("Highest Placement:");
            if (cse == ece)
                System.out.println("CSE\nECE");
            else if (cse == mech)
                System.out.println("CSE\nMECH");
            else
                System.out.println("ECE\nMECH");
        }
        sc.close();
    }
}
