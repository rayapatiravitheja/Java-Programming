/* Given a pair of positive integers m and n, write a program to smartly affix zeroes, while printing the numbers from m to n.

Input Format

Input consists of two integers.

Constraints

(m < n; 0 < m < 999; 1 < n < = 999),

Output Format

Execute the range value, and add it with affix zeros(depending on the digit's range values)

Sample Input 0

9
100
Sample Output 0

009 010 011 012 013 014 015 016 017 018 019 020 021 022 023 024 025 026 027 028 029 030 031 032 033 034 035 036 037 038 039 040 041 042 043 044 045 046 047 048 049 050 051 052 053 054 055 056 057 058 059 060 061 062 063 064 065 066 067 068 069 070 071 072 073 074 075 076 077 078 079 080 081 082 083 084 085 086 087 088 089 090 091 092 093 094 095 096 097 098 099 100
Sample Input 1

5
10
Sample Output 1

05 06 07 08 09 10 */

//Code

import java.util.*;
public class SmartyFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int width = String.valueOf(n).length();
        for (int i = m; i <= n; i++) {
            System.out.printf("%0" + width + "d", i);
            if (i != n)
                System.out.print(" ");
            sc.close();
        }
    }
}
