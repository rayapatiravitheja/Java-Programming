/*Seela wants to find the sum of even and odd numbers in the between range values.could you please help her to implements the program.

Input Format

Input consists of two integer.
Constraints

Given N is greater than 1 and lesser than 100.

Output Format

Print the sum of even num and odd num.
Sample Input 0

3
9
Sample Output 0

The Even Sum value is 18.00
The Odd Sum value is 24.00
Sample Input 1

11
23
Sample Output 1

The Even Sum value is 102.00
The Odd Sum value is 119.00
Sample Input 2

100
200
Sample Output 2

Invalid Input */
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double even=0;
        double odd=0;
         if(a<=1||b>=100||b<=1||a>=100){
            System.out.println("Invalid Input");
         }else{
        for(int i=a;i<=b;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
            }
                System.out.printf("The Even Sum value is %.2f\n",even);
                System.out.printf("The Odd Sum value is %.2f",odd);
       
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
