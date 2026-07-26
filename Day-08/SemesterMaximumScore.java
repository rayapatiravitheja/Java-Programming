/* Raj wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display “You have entered invalid mark.”

Sample Input 1:

Enter no of semester:3
Enter no of subjects in 1 semester:3
Enter no of subjects in 2 semester:4
Enter no of subjects in 3 semester:2
Marks obtained in semester 1: 50 60 70
Marks obtained in semester 2: 90 98 76 67
Marks obtained in semester 3: 89 76
Sample Output 1:

Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89
Input Format

First input get the number of semester.
Then get the input for no of subject for each semster.
Then get the input for no of marks in the each semester.
Constraints

No Constraints

Output Format

Find the maximum mark in the each semesters

Sample Input 0

2
3
2
45
55
65
88
79
Sample Output 0

Enter no of semester:
2
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
2
Marks obtained in semester 1:
45
55
65
Marks obtained in semester 2:
88
79
Maximum mark in 1 semester:65
Maximum mark in 2 semester:88
Sample Input 1

1
3
85
120
90
Sample Output 1

Enter no of semester:
1
Enter no of subjects in 1 semester:
3
Marks obtained in semester 1:
85
120
90
You have entered invalid mark. */

//Code

import java.util.Scanner;

public class SemesterMaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of semester:");
        int sem = sc.nextInt();
        System.out.println(sem);

        int[] sub = new int[sem];
        int[] max = new int[sem];
        boolean invalid = false;
        for (int i = 0; i < sem; i++) {
            System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
            sub[i] = sc.nextInt();
            System.out.println(sub[i]);
        }
        for (int i = 0; i < sem; i++) {
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            int m = Integer.MIN_VALUE;
            for (int j = 0; j < sub[i]; j++) {
                int mark = sc.nextInt();
                System.out.println(mark);
                if (mark < 0 || mark > 100) {
                    invalid = true;
                }
                if (mark > m) {
                    m = mark;
                }
            }
            max[i] = m;
        }
        if (invalid) {
            System.out.println("You have entered invalid mark.");
        } else {
            for (int i = 0; i < sem; i++) {
                System.out.println("Maximum mark in " + (i + 1) + " semester:" + max[i]);
            }
        }
        sc.close();
    }
}
