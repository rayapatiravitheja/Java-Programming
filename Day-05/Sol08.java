/*

Write the Program to execute the program.

Input Format

Input consist of single integer.

Constraints

No Constraints

Output Format

Execute the pattern

Sample Input 0

7
Sample Output 0

+     +
+     +
+     +
+$$$$$+
+     +
+     +
+     +
Sample Input 1

11
Sample Output 1

+         +
+         +
+         +
+         +
+         +
+$$$$$$$$$+
+         +
+         +
+         +
+         +
+         +


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol08 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n){
                System.out.print("+");
                }
                else if(i==mid){
                    System.out.print("$");
                }
        else{
                System.out.print(" ");
        }
    }
    System.out.println();
        }
        sc.close();
    }
}
