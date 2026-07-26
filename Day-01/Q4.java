/* write the program to execute the decimal values.

Input Format

input consists of float
Constraints

No Constraints

Output Format

execute the float values depends on the sample ouput.
Sample Input 0

34.12345
Sample Output 0

34.12345
34.1235
34.123
34.12
34.1
34
Sample Input 1

56.67897
Sample Output 1

56.67897
56.6790
56.679
56.68
56.7
56 */

//Code


import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        
        System.out.printf("%.5f\n", num);
        System.out.printf("%.4f\n", num);
        System.out.printf("%.3f\n", num);
        System.out.printf("%.2f\n", num);
        System.out.printf("%.1f\n", num);
        System.out.printf("%.0f\n", num);
        
        sc.close();
    }
}