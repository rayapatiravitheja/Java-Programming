/*A factorial is the product of all the natural numbers less than or equal to the given number n.Sheela wants to know how its working in programming.

For Example,

    The factorial of 6 is 6 * 5 * 4 * 3 * 2 * 1 which is 720.
could you please help her to write the program to find the factorial of a number.

Input Format

Input consists of one integer
Constraints

Given N is non Negative values.

Output Format

print the factorial Values
Sample Input 0

5
Sample Output 0

The Factorial of 5 is 120
Sample Input 1

6
Sample Output 1

The Factorial of 6 is 720
Sample Input 2

-4
Sample Output 2

Invalid Input */
import java.util.*;

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int mul=1;
        if(a<0){
            System.out.println("Invalid Input");
        }else{
            for(int i=1;i<=a;i++){
                    mul*=i;
                }
            System.out.println("The Factorial of "+a+" is "+mul);

            }        }        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
