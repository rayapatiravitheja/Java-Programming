/*

Write the program to execute the pattern program.

Input Format

Input consist of single integer

Constraints

No Constraints

Output Format

Execute the Pattern.

Sample Input 0

3
Sample Output 0

  *
 **
***
 **
  *
Sample Input 1

7
Sample Output 1

      *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *


 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol07 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        
    }
}
