/* Write a program to check whether the given strings are anagrams or not.

Input Format

Input consists of 2 string.

Constraints

No constraints

Output Format

Output should print "Strings are anagrams" or "Strings aren't anagrams".

Sample Input 0

recitals
articles
Sample Output 0

Strings are anagrams
Sample Input 1

book
cook
Sample Output 1

Strings aren't anagrams */

//Code

import java.util.*;


public class StringAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        
        Arrays.sort(ch2);
        if(new String(ch1).equals(new String(ch2))){
            System.out.print("Strings are anagrams");
        } else {
            System.out.print("Strings aren't anagrams");
        }
        sc.close();
    }
}
