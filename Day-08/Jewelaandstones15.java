/* You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Input Format

Example: Example 1:

Input: jewels = "aA", stones = "aAAbbbb" Output: 3 Example 2:

Input: jewels = "z", stones = "ZZ" Output: 0

Constraints

1 <= jewels.length, stones.length <= 50 jewels and stones consist of only English letters. All the characters of jewels are unique.

Output Format

Execute in the given output format

Sample Input 0

abc
aabccgasdh
Sample Output 0

6 */

//Code

import java.util.*;
public class Jewelaandstones15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jewels = sc.nextLine().trim();
        String stones = sc.nextLine().trim();
        Set<Character> jewelSet = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }
        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}
