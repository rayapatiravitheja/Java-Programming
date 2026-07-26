/* Write the program to execute conversion of other datatype.

Input Format

input corresponds to the integer
Constraints

No constraints

Output Format

output corresponds to the ASCII values(character)
Sample Input 0

68
Sample Output 0

D
Sample Input 1

111
Sample Output 1

o */

//Code


import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((char)n);
        sc.close();
    }
}