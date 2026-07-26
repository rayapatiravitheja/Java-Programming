/*Riya wants to clear the logical Reasoning in the Placement.she has a doubt in the topic of series number.She didn't to how to execute the series number and how to calculate it.Could you please help her to implements the program.

Input Format

input consists of one integer.
Constraints

No Constraints

Output Format

Execute the series of numbers.
Sample Input 0

5
Sample Output 0

Number series from 1 to 5 is 2 4 6 8 10
Sample Input 1

6
Sample Output 1

Number series from 1 to 6 is 2 4  */
import java.util.*;

public class Solution8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Number series from 1 to "+n+" is ");
        for(int i=1;i<=n;i++){
            int sum=2*i;
            System.out.print(sum+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
