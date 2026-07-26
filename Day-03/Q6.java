/* Maya wants to know how to find whether the alphabet is Vowel or Consonant.could you please help her to find the alphabet is Vowel or Consonant.

Input Format

input consists of one Character.
Constraints

No Constraints

Output Format

print whether the character is Vowel or Consonant or Invalid Input.
Sample Input 0

A
Sample Output 0

The Character A is Vowel
Sample Input 1

B
Sample Output 1

The Character B is Consonant
Sample Input 2

u
Sample Output 2

The Character u is Vowel
Sample Input 3

9
Sample Output 3

Invalid Input */

//Code

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        
        if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
            System.out.println("Invalid Input");
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                   ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The Character " + ch + " is Vowel");
        } else {
            System.out.println("The Character " + ch + " is Consonant");
        }
        
        sc.close();
    }
}