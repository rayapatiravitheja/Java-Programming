/* Lucy and Tina are close friends. They both are studying in the same school. Now they are on their summer vacation. As they are bored, they ask their parents to take them to an exhibition. There Lucy and Tina play a game. In this game, there are three boxes with some number written on their top. There is a treasure in one of the three boxes and the treasure is present in the box with the second largest number on its top. Also, to open the box, they need to decode the correct code of this box. The clue given to them to find the code is that it is the largest number which divides all the three given numbers.So, now help Lucy and Tina to decode the code.

Input Format

Input consists of three integers.
First input corresponds to the number of the first box.
Second input corresponds to the number of the second box.
Third input corresponds to the number of the third box.
Constraints

No Constraints

Output Format

Execute the Lucy and Tina to decode the code.

Sample Input 0

2
4
6
Sample Output 0

The treasure is in the box which has number 4.
The code to open the box is 2.*/
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int second;

        if ((a > b && a < c) || (a > c && a < b))
            second = a;
        else if ((b > a && b < c) || (b > c && b < a))
            second = b;
        else
            second = c;
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The treasure is in the box which has number " + second + ".");
        System.out.println("The code to open the box is " + gcd + ".");
    }
}
