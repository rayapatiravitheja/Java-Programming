/* You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

You must perform an operation shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'. For every odd index i, you want to replace the digit s[i] with the result of the shift(s[i-1], s[i]) operation.

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

Note that shift(c, x) is not a preloaded function, but an operation to be implemented as part of the solution.

Input Format

Example 1:

Input: s = "a1c1e1"

Output: "abcdef"

Explanation: The digits are replaced as follows:

s[1] -> shift('a',1) = 'b'
s[3] -> shift('c',1) = 'd'
s[5] -> shift('e',1) = 'f' Example 2:
Input: s = "a1b2c3d4e"

Output: "abbdcfdhe"

Explanation: The digits are replaced as follows:

s[1] -> shift('a',1) = 'b'
s[3] -> shift('b',2) = 'd'
s[5] -> shift('c',3) = 'f'
s[7] -> shift('d',4) = 'h'
Constraints

Constraints:

1 <= s.length <= 100 s consists only of lowercase English letters and digits. shift(s[i-1], s[i]) <= 'z' for all odd indices i.

Output Format

Execute the output in given sample input format

Sample Input 0

a1c1e1
Sample Output 0

abcdef
Sample Input 1

a1b2c3d4e
Sample Output 1

abbdcfdhe */

//Code

import java.util.*;


public class Replacealldigitswithcharacter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[]= str.toCharArray();
        for(int i=1;i<arr.length;i+=2){
            int shift = arr[i]-'0';
            arr[i]=(char)(arr[i-1]+shift);
        }
        System.out.print(new String(arr));
        sc.close();
    }
}
