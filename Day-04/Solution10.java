/*Write a program to check whether a given number is Neon number or not.

Note-A neon number is a number where the sum of digits of square of the number is equal to the number. The task is to check and print neon numbers in a range. sum of the digits of the square is 9. + 4 + 4) which is not equal to 12

Input Format

Input consists of Single Integer.

Constraints

Given inputs between the range of 1 to 9

Output Format

If the Conditions is true Print the Statement depends on the testcases. If the Condidtions is false Print the statement depends on the testcases. If the input is not upto the range Print the statement "Invalid Input".

Sample Input 0

6
Sample Output 0

0006 is not a Neon Number.
Sample Input 1

9
Sample Output 1

009 is a Neon Number.
Sample Input 2

23
Sample Output 2

Invalid Input */
import java.util.*;

public class Solution10 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum1=0;
            int sum2=0;
            if(n>=1&&n<=9){
                    sum1=n*n;
                    sum2=sum1/10+sum1%10;
            if(n==sum2){
                System.out.println("00"+n+" is a Neon Number.");
            }else{
                System.out.println("000"+n+" is not a Neon Number.");
            }
            
    }else{
        System.out.print("Invalid Input");
    }
}
}

