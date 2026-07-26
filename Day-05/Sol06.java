/*

Write the program to execute the pattern.

Input Format

Input consists of Single integer.

Constraints

No Constraints

Output Format

Execute the Pattern.

Sample Input 0

7
Sample Output 0

*************
 *AAAAAAAAA*
  *BBBBBBB*
   *CCCCC*
    *DDD*
     *E*
      *
Sample Input 1

8
Sample Output 1

***************
 *AAAAAAAAAAA*
  *BBBBBBBBB*
   *CCCCCCC*
    *DDDDD*
     *EEE*
      *F*
       *

*/


import java.util.*;
public class Sol06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        char ch = 'A';
        for (int i=1;i<n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int letters = 2 * (n-i) - 3;
            for (int j = 1; j <= letters; j++) {
                System.out.print(ch);
            }
            if (letters > 0) {
                System.out.print("*");
            }
            System.out.println();
            ch++;
        }
    }
}
