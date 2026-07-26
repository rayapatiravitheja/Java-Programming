/* You are part of a school management team organizing a large educational trip. Hundreds of students are going, and your job is to arrange transport efficiently so that no student is left behind and resources are used wisely. Each school bus has a fixed seating capacity, and you must decide: How many buses are required to accommodate all students How many seats will remain empty in the last bus, since it may not be completely full Instead of manually counting or guessing, you need to build a program that takes the total number of students and bus capacity as input and uses mathematical operators to handle this calculation accurately.

Input Format

First input is for total no of students
Second input is for bus capacity
Constraints

No constraints

Output Format

Execute the total number of buses needed and seats left in last bus

Sample Input 0

120 50
Sample Output 0

Total buses needed: 3
Seats left in last bus: 30
Sample Input 1

200 60
Sample Output 1

Total buses needed: 4
Seats left in last bus: 40 */

//Code

import java.util.*;

public class SchoolBusSeatPlanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        int b= (s+c-1)/c;
        int l = b*c-s;
        System.out.println("Total buses needed: "+b);
        System.out.println("Seats left in last bus: "+l);
        sc.close();
    }
}
