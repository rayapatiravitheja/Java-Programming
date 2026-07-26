/*To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers. Can you help him out?

Write a program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. Range must always be greater than zero. If any of the condition mentioned above fails, then display “Provide valid input” Use a minimum of one for loop and one while loop

Input Format

Get to integer value from the user

Constraints

No Constraints

Output Format

Execute the prime series

Sample Input 0

34
78
Sample Output 0

37 41 43 47 53 59 61 67 71 73
Sample Input 1

33
11
Sample Output 1

Provide valid input*/
import java.util.*;

public class Solution14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        if(n>a){
            System.out.println("Provide valid input");
        }else{
            
        for(int i=n;i<=a;i++){
            int count=0;
            for(int j=2;j<=a;j++){
                if(i%j==0){
                    count++;
                }
            }
        
            if(count==1){
                System.out.print(i+" ");
            }
    }
}
}
}
