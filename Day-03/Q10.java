/* College Management wants to separate the eligible students for their placement.so find the eligible students for the placement.

Notes:-

- If the students has 1 arrear and the cpga is above 70 - They are eligible for Placement.
- If the students has 1 or 2 arrear and the cpga is above 75 -They are eligible for Placement.
- Remaining students aren't eligible for Placement.
Input Format

input consists of one String and two integer.
Constraints

No Constraints

Output Format

print the statement "Eligible for Placement" or "Not Eligible for Placement".
Sample Input 0

John
1
76
Sample Output 0

Name of the Student:John
John is Eligible for Placement
Sample Input 1

John
2
70
Sample Output 1

Name of the Student:John
John is Not Eligible for Placement */

//Code

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine().trim();
        int arrears = scanner.nextInt();
        int cgpa = scanner.nextInt();
        System.out.println("Name of the Student:" + studentName);
        if (arrears == 1 && cgpa > 70) {
            System.out.println(studentName + " is Eligible for Placement");
        } else if ((arrears == 1 || arrears == 2) && cgpa > 75) {
            System.out.println(studentName + " is Eligible for Placement");
        } else {
            System.out.println(studentName + " is Not Eligible for Placement");
        }
        scanner.close();
    }
}
