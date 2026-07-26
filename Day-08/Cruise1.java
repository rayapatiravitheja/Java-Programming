/* A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example:

Input :

5 -> Value of T [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by new line [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new line. Output : 8 -> Maximum number of guests on cruise at an instance.

Explanation: Explanation:

1st hour: Entry : 7 Exit: 1 No. of guests on ship : 6

2nd hour : Entry : 0 Exit : 2 No. of guests on ship : 6-2=4

Hour 3: Entry: 5 Exit: 1 No. of guests on ship : 4+5-1=8

Hour 4: Entry : 1 Exit : 3 No. of guests on ship : 8+1-3=6

Hour 5: Entry : 3 Exit: 4 No. of guests on ship: 6+3-4=5 Hence, the maximum number of guests within 5 hours is 8.

Input Format

Given in the problem statement

Constraints

1<=T<=25 0<= E[i] <=500 0<= L[i] <=500

Output Format

Given in the problem statement

Sample Input 0

5
7 0 5 1 3
1 2 1 3 4
Sample Output 0

Maximum number of guests within 5 hours is 8
Sample Input 1

4
2 1 7 5
0 3 2 1
Sample Output 1

Maximum number of guests within 4 hours is 9 */

//Code

import java.util.*;

public class Cruise1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[] = new int[n];
        for (int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int max=0;
        int temp=0;
        for (int i=0;i<n;i++){
            int sum=0;
            int num=arr1[i]-arr2[i];
            sum+=num;
            max+=sum;
            if(max>temp){
                temp=max;
            }
        }
        
        System.out.print("Maximum number of guests within "+n+" hours is "+temp);
    sc.close();
    }
}
