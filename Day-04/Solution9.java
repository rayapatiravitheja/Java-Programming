/*Riya wants to clear the logical Reasoning in the Placement.she has a doubt in the topic of series number.She didn't to how to execute the series number and how to calculate it.Could you please help her to implements the program.

Input Format

Input consists of one integer.
Constraints

No Constraints

Output Format

Execute the series of numbers.
Sample Input 0

5
Sample Output 0

Number series from 1 to 5 is 2 3 4 6 6
Sample Input 1

8
Sample Output 1

Number series from 1 to 8 is 2 3  */
import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        System.out.print("Number series from 1 to "+num+" is ");
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum=i+i/2;
            }else{
                sum=i+1;
            }
        System.out.print(sum+" ");
        }        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
