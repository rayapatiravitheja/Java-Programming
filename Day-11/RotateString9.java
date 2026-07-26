/* Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift

Input Format

Example 1:

Input: s = "abcde", goal = "cdeab" Output: true

Example 2:

Input: s = "abcde", goal = "abced" Output: false

Constraints

1 <= s.length, goal.length <= 100 s and goal consist of lowercase English letters.

Output Format

Execute the Boolean statement.

Sample Input 0

abcde
cdeab
Sample Output 0

true
Sample Input 1

abcde
cedba
Sample Output 1

false */

//Code

import java.util.*;

public class RotateString9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String goal = sc.nextLine();
        if(str.length()!=goal.length()){
            System.out.print("false");
        } else {
            String temp = str + str;
            if (temp.contains(goal)){
                System.out.print("true");
            } else {
                System.out.print("false");
            }
            
        }
        sc.close();
    }
}
