/*Riya wants to find the sum of range values. could you please help her to implements the program.

Input Format

input consists of two integer
Constraints

No Constraints

Output Format

print the sum of range values.
Sample Input 0

1
5
Sample Output 0

The sum of Range value from 1 to 5 is 15.0
Sample Input 1

5
10
Sample Output 1

The sum of Range value from 5 to 10 is 45.0 */
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        
        } 
        System.out.println("The sum of Range value from "+a+" to "+b+" is "+sum);
        
    }
}
