/* You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.

Input Format

Example 1:

Input: s = "hello"

Output: 13

Explanation:

The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

Example 2:

Input: s = "zaz"

Output: 50

Explanation:

The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.

Constraints

2 <= s.length <= 100 s consists only of lowercase English letters.

Output Format

Execute the output in given input format.

Sample Input 0

zaz
Sample Output 0

50
Sample Input 1

hello
Sample Output 1

13 */

//Code

//import java.io.*;
import java.util.*;


public class Scoreofstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String atr = sc.next();
        char arr[]=atr.toCharArray();
        int s=0;
        for (int i=0;i<arr.length-1;i++){
            int d = Math.abs(arr[i]-arr[i+1]);
            s+=d;
        }
        System.out.print(s);
    sc.close();
    }
}
