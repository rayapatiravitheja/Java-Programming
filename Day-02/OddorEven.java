/* Seela wants to find whether the given number is even or odd with in the range of 1 to 100.Could you please help her to find it.

Input Format

Input Consists of Integer

Constraints

N value is 1 to 100

Output Format

If the given number is even, Print the Statement based on the test case. If the given number is odd,Print the statement based on the test case. If the given number is not upto the constraints,Print the statement as "Invalid Input".

Sample Input 0

18
Sample Output 0

The Given Number 018 is Even.
Sample Input 1

7
Sample Output 1

The Given Number 007 is Odd.
Sample Input 2

200
Sample Output 2

Invalid Input */

//Code

import java.util.*;

public class OddorEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            if (num >= 1 && num <= 100) {
                String status = (num % 2 == 0) ? "Even" : "Odd";
                System.out.printf("The Given Number %03d is %s.%n", num, status);
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }
        
        sc.close();
    }
}
