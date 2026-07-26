/*Given an integer, we need to find the sum of values of that table.

Explanation: 3

3*1 + 3*2 + 3*3 =3 + 6 + 9 = 18

Input Format

Input:10

Constraints

No Constraints

Output Format

Output:550

Sample Input 0

8
Sample Output 0

288
Sample Input 1

4
Sample Output 1

40 */
import java.util.*;

public class Solution11 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        sum=n*i+sum;
        }
        System.out.print(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

