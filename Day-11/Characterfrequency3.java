/* A text analytics company processes millions of customer reviews every day to identify frequently used characters and typing patterns. As part of its preprocessing pipeline, the system rearranges the characters in each review based on how often they appear. Characters with higher frequencies are placed before those with lower frequencies, making it easier to perform further statistical analysis and compression. If two characters have the same frequency, they may appear in any order. Develop a program that sorts the characters of a given string according to their frequency in descending order.

Problem Statement

Given a string S, rearrange its characters in descending order of their frequency.

Characters with a higher frequency should appear before characters with a lower frequency.
If two or more characters have the same frequency, they may appear in any order.
Explanation

The frequency of each character is:

t → 1
r → 1
e → 2
Since 'e' appears 2 times, it should appear first.

The remaining characters 't' and 'r' each appear once, so they can appear in any order.

Hence, one valid output is:

eert
Input Format

A single string S.

Constraints

1 ≤ Length of S ≤ 10^5
The string may contain uppercase letters, lowercase letters, digits, and special characters.
The output must contain exactly the same characters as the input string.
Output Format

Print a string in which the characters are sorted based on their frequency in descending order.

Sample Input 0

Aabb
Sample Output 0

bbAa
Sample Input 1

mississippi
Sample Output 1

iiiissssppm */

//Code

import java.util.*;
public class Characterfrequency3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        for (int f = s.length(); f >= 1; f--) {
            for (int i = 0; i < 128; i++) {
                if (freq[i] == f) {
                    for (int j = 0; j < f; j++) {
                        ans.append((char) i);
                    }
                }
            }
        }
        System.out.print(ans.toString());
        sc.close();
    }
}
