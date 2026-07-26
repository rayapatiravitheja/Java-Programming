/* Write a program to sort the given string.

Input Format

Input consists of 1 string.

Constraints

No Constraints

Output Format

Output print the ascending order of given string.

Sample Input 0

god
Sample Output 0

The sorted string is dgo */

//Code

import java.util.*;

public class Stringsorting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        System.out.println("The sorted string is "+(new String(arr)));
        sc.close();
    }
}
