/*


Write a program to execute the Pattern.

Input Format

Input consists single Integer.

Constraints

Constraints

Output Format

Execute the pattern

Sample Input 0

5
Sample Output 0

*   *
 * *
  *
 * *
*   *
Sample Input 1

9
Sample Output 1

*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol05 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n-i+1 ||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
