/*

Write a program to execute the Pattern.

Input Format

Input consists single Integer.

Constraints

Constraints

Output Format

Execute the pattern

Sample Input 0

4
Sample Output 0

* * * *
* 1 2 *
* 3 4 *
* * * *


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol02 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 ||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
