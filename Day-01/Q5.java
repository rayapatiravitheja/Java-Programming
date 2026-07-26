/*kumar wants to know how the math functions are working in programming.could you please help him to write the program.

Input Format

First input corresponds to float is for floor,ceil and round
second input corresponds to integer is for sqrt value
third input corresponds to integer is for base value
fourth input corresponds to integer is for power value
Constraints

No Constraints

Output Format

execute the values depends on the sample output format.
Sample Input 0

67.6734
16
5
2
Sample Output 0

67
68
68
4
25 */

//Code


import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num = sc.nextFloat();
        int sqrtNum = sc.nextInt();
        int base = sc.nextInt();
        int power = sc.nextInt();
        
        System.out.println((int)Math.floor(num));
        System.out.println((int)Math.ceil(num));
        System.out.println(Math.round(num));
        System.out.println((int)Math.sqrt(sqrtNum));
        System.out.println((int)Math.pow(base, power));
        
        sc.close();
    }
}