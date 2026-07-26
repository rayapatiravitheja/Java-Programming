/* Jack is always excited about sunday. It is favorite day, when he gets to play all day. And goes to cycling with his friends.

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

Explanation:
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
Input Format

Example 1:

Input

mon-> input String denoting the start of the month.

13 -> input integer denoting the number of days from the start of the month.

Constraints

No Constraints

Output Format

Output :

2 -> number of days within 13 days.

Sample Input 0

mon
23
Sample Output 0

3
Sample Input 1

fri
10
Sample Output 1

2
Sample Input 2

sun
7
Sample Output 2

2 */

//Code

import java.util.*;


public class Favoriteday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        int start = 0;
        switch(day.toLowerCase()) {
            case "sun":
                start = 0;
                break;
            case "mon":
                start = 1;
                break;
            case "tue":
                start = 2;
                break;
            case "wed":
                start = 3;
                break;
            case "thu":
                start = 4;
                break;
            case "fri":
                start = 5;
                break;
            case "sat":
                start = 6;
                break;
        }
        int count = 0;
        for (int i=0;i<=n;i++) {
            if ((start+i)%7==0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
