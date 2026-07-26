/* Diya wants to know how the decimal digit values are performing in programming.could you please help her to learn the decimal formatting.

Input Format

input consists of float
Constraints

No Constraints

Output Format

execute the values depends on the sample output format.
Sample Input 0

45.3456
Sample Output 0

45.34
45.35 */

//Code


import java.util.*;
public class Q6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float dec = sc.nextFloat();
        double d = Math.floor(dec * 100)/100;
        System.out.printf("%.2f\n", d);
        System.out.printf("%.2f", dec);
        sc.close();
    }
}
