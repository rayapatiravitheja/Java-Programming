/*Given an integer, we need to find the sum of values of that table.

Input:10

Output:550

Explanation: 10*1+10*2+…..10*10

Input Format

Given in the problem statement

Constraints

No constraints

Output Format

Given in the problem statement

Sample Input 0

45
Sample Output 0

46575 */
import java.util.*;
public class Solution16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=n*i;
        }
        System.out.print(sum);
    }
}
