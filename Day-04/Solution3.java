/*The program to find if the given numbers are Friendly pairs or not (Amicable or not) is discussed here. Friendly Pairs are two or more numbers with a common abundance.

For example,6 and 28 are Friendly Pairs.

    (Sum of divisors of given number1)/given number1 = (Sum of divisors of given number2)/given number2  
- sum of divisors for 6 is 1,2,3,6=(1+2+3+6)=12
- sum of divisors for 28 is 1,2,4,7,14,28=56
- (12/6)==(56/28).Its a Friendly Pair.
Input Format

Input consists of 2 integers.
Constraints

No Constraints

Output Format

If it is a Friendly Pair display "Friendly Pair" or displays "Not Friendly Pair".
Sample Input 0

15
25
Sample Output 0

The Given Number 15 and 25 are Friendly Pairs.
Sample Input 1

8
30
Sample Output 1

The Given Number 8 and 30 are */
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=1;
        int sum2=1;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                sum1+=i;
            }
        }
         for(int j=2;j<=b;j++){
            if(b%j==0){
                sum2+=j;
    }
         }
         int avg1=sum1/a;
         int avg2=sum2/b;
         if(avg1==avg2){
            System.out.println("The Given Number " +a+ " and "+b+" are Friendly Pairs.");
         }else{
            System.out.println("The Given Number "+a+" and "+b+" are Not Friendly Pairs.");
         }
    }
}
