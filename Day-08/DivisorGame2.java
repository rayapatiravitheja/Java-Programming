/* Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n and n % x == 0. Replacing the number n on the chalkboard with n - x. Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.

Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.

Input Format

Example: Example 1:

Input: n = 2 Output: true Explanation: Alice chooses 1, and Bob has no more moves. Example 2:

Input: n = 3 Output: false

Constraints

No Constraints

Output Format

Explanation:

Alice chooses 1, Bob chooses 1, and Alice has no more moves.

Sample Input 0

6
Sample Output 0

true
Sample Input 1

9
Sample Output 1

false */

//Code

import java.util.*;
public class DivisorGame2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("true");
        }else {
            System.out.print("false");
        }
        sc.close();
    }
}

    