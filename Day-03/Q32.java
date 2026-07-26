/* Dheena wants to know how the grading marks will works in education.could you please help him to learn the grading System. Note:-

100=Grade is S
90-99=Grade is A
80-89=Grade is B
70-79=Grade is C
60-69=Grade is D
50-59=Grade is E
<50=Fail
Get the subject marks from the user,then Find the average marks.Based on the average marks generate the Students grade marks.

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

execute the total Marks,average marks and Grade Mark
Sample Input 0

John
100
99
100
100
99
Sample Output 0

Name of the Student:John
Total Mark:498
Average Mark:99.6
Grade Mark:A
Sample Input 1

Nivi
30
30
30
30
30
Sample Output 1

Name of the Student:Nivi
Total Mark:150
Average Mark:30.0
Grade Mark:Fail */

//Code

import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        String grade;
        
        if (average >= 100) {
            grade = "S";
        } else if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Name of the Student:" + name);
        System.out.println("Total Mark:" + total);
        System.out.println("Average Mark:" + average);
        System.out.println("Grade Mark:" + grade);
        
        sc.close();
    }
}