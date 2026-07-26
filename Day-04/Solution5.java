/* Veena wants know to whether the given number is perfect number or not.could you please help her to find it and implements in program.

If the Sum of proper factor is equals to the given number,its a perfect number.
For example,Proper factor of 6 is 1,2,3=>(1+2+3)=6

    sum of factor is 6 and the given number is also 6 so its a perfect number.
Input Format

integer consists of one integer.
Constraints

Given N is Non Negative Numbers

Output Format

Execute the statement "Perfect Number" or "Not Perfect Number".
Sample Input 0

6
Sample Output 0

The Number 6.0 is a Perfect Number.
Sample Input 1

10
Sample Output 1

The Number 10.0 is a Not Perfect Number.
Sample Input 2

-1
Sample Output 2

Invalid Input*/
import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double sum=0.0;
        if(a<0){
            System.out.println("Invalid Input");
        }else{
            for(int i=1;i<a;i++){
               if(a%i==0){
                sum+=i;
               } 
            }
        if(sum==a){
            System.out.println("The Number "+(double)a+" is a Perfect Number.");
        }else{
            System.out.println("The Number "+(double)a+" is a Not Perfect Number.");
        }
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
