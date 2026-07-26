/*

Write a program to execute the Pattern

Input Format

Input consist of single integer.

Constraints

No Constraints

Output Format

Execute the pattern

Sample Input 0

3
Sample Output 0

  1
 1A1
1ABC1
Sample Input 1

5
Sample Output 1

    1
   1A1
  1ABC1
 1ABCDE1
1ABCDEFG1

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol01 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("1");
            int ascii=65;
        for (int k=1;k<=2*i-3;k++){
            System.out.print((char)ascii);
            ascii++;
        }
        for(int k=2;k<=i;k++){
            System.out.print("1");
            break;
        }
        System.out.println();
        }
    }
}
