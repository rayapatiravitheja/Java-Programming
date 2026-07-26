/* The rules for generating Collatz Sequence are:

If n is even: n = n / 2
If n is odd: n = 3n + 1
For example, if the starting number is 5 the sequence is:

5 -> 16 -> 8 -> 4 -> 2 -> 1
It has been proved that for almost all integers, the repeated application of the above rule will result in a sequence that ends at 1.

Given a positive integer, write a program to print this sequence and the number of times this rule needs to be applied in order to reach 1.

Input Format

Input consists of a positive integer.

Constraints

No Constraints

Output Format

Print the numbers in the sequence, one per line and finally print the number of times the rule has to be applied in order to reach 1.

Sample Input 0

5
Sample Output 0

Enter a number
5
16
8
4
2
1
count:5
Sample Input 1

6
Sample Output 1

Enter a number
6
3
10
5
16
8
4
2
1
count:8*/
import java.util.*;

public class Solution15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
      //  int sum=0;
        System.out.println("Enter a number");
        System.out.println(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                count++;
            }
            else{
                n=3*n+1;
                count++;
            }
            System.out.println(n);
           // count++;
        }
        System.out.println("count:"+count );
        
    }
}

