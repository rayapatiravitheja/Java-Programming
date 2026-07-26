/* Sanjay wants to know whether the user input is Automorphic number or not.

For example,

    The Automorphic number is square of the number ends with the Same number. 
    Square of 5 is 25,its ends with the value of 5.
    so the number 5 is Automorphic Number.
could you please help him to find it and implements in program.

Input Format

Input consists of one integer
Constraints

Given N is greater than 1 and lesser than 9.

Output Format

Print the statement whether the given number is "Automorphic Number" or "Not Automarphic Number".
Sample Input 0

5
Sample Output 0

The Number 5.0 is Automorphic Number
Sample Input 1

9
Sample Output 1

The Number 9.0 is Not Automorphic Number
Sample Input 2

12
Sample Output 2

Invalid Input*/
import java.util.*;

public class Solution6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=1||a>9){
            System.out.println("Invalid Input");
        }else{
            int sqr=a*a;
            int last=sqr%10;
            if(last==a){
                System.out.println("The Number "+(float)a+" is Automorphic Number");
            }else{
                System.out.println("The Number "+(float)a+" is Not Automorphic Number");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
