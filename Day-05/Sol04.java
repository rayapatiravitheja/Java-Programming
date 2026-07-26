/*


Write a program to execute the Pattern.

Input Format

Input consists single Integer.

Constraints

No Constraints

Output Format

Execute the Pattern.

Sample Input 0

3
Sample Output 0

  *
 * *
*   *
 * *
  *
Sample Input 1

5
Sample Output 1

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
Sample Input 2

8
Sample Output 2

       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *
    

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol04 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>0){
                for(int j=0;j<2*i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>0){
                for(int j=0;j<2*i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
