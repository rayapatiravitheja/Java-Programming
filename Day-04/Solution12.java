/*Write the program to find the sum of values. Example:-

The given Number is 10.

(10*1)+(10*2)+(10*3)+......(10*10)=550

The HINT- The Logic of the program depends on the given integer digits.

Input Format

Input consists of one integer.

Constraints

The given number is not more than 20.

Output Format

The sum of the given values.

If the input exceeds the constraints print the statement "Invalid Input".

Sample Input 0

2
Sample Output 0

6
Sample Input 1

12
Sample Output 1

936
Sample Input 2

45
Sample Output 2

Invalid Input */
import java.util.*;

public class Solution12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<=20&&n>=1){
        for(int i=1;i<=n;i++){
                sum=n*i+sum;
        }
        System.out.print(sum);
            }else{
                System.out.println("Invalid Input");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}

