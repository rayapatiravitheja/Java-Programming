/* Maya wants to know how the Numbers are converted to string in the program.could you please help her to implements the program.

Input Format

input consists of one integer
Constraints

Given N is greater than 0 and lesser than 9
Output Format

print the number into string type.
Sample Input 0

0
Sample Output 0

Integer is 0 and String is Zero
Sample Input 1

2
Sample Output 1

Integer is 2 and String is Two
Sample Input 2

10
Sample Output 2

Invalid Input */

//Code

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String word;
        
        if (num < 0 || num > 9) {
            System.out.println("Invalid Input");
        } else {
            switch(num) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "";
            }
            
            System.out.println("Integer is " + num + " and String is " + word);
        }
        
        sc.close();
    }
}