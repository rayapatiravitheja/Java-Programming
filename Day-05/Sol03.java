/*

Write a program to execute the Pattern.

Input Format

Input consists single Integer.

Constraints

Constraints

Output Format

Execute the pattern

Sample Input 0

3
Sample Output 0

*****
 ***
  *
 ***
*****
Sample Input 1

5
Sample Output 1

********* 
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
Sample Input 2

7
Sample Output 2

*************
 ***********
  *********
   *******
    *****
     ***
      *
     ***
    *****
   *******
  *********
 ***********
*************


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol03 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*m-1;k++){
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
        for(int i=2;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
