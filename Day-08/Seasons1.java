/* Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring – March to May, Summer – June to August, Autumn – September to November and, Winter – December to February. Month should be in the range 1 to 12. If not the output should be “Invalid month”.

Input Format

One Integer data

Constraints

No Constraints

Output Format

Execute the statement based on the conditions

Sample Input 0

Enter the month:3
Sample Output 0

Season:Spring
Sample Input 1

Enter the month:15
Sample Output 1

Invalid month
 */

//Code

import java.util.Scanner;

public class Seasons1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replaceAll("[^0-9-]", "");

        int month = Integer.parseInt(input);

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Season:Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Season:Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Season:Autumn");
        } else {
            System.out.println("Season:Winter");
        }

        sc.close();
    }
}

