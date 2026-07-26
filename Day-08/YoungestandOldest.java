/* The Pan Am 73 flight from Bombay to New York en route to Karachi and Frankfurt was hijacked by a few Palestinian terrorists at the Karachi International Airport.

The senior flight purser Neerja Banhot had to wither her fear and start evacuating the passengers on board. She pleaded the hijackers to release the oldest and the youngest person in the aircraft. Heeding to her plea the chief of the hijacker agreed to let go the oldest and the youngest. Given the ages of the passengers find the oldest and the youngest.

Input Format

The first line of input consists of an integer n, corresponding to the number of passengers in the aircraft.

The next line consists of the age of passengers separated by a space.

Constraints

No Constraints

Output Format

The output prints the youngest and oldest separated by a space.

Print Invalid Input if n or any one of the ages is negative.

Sample Input 0

5
18 17 19 12 16
Sample Output 0

Youngest=12
Oldest=19
Sample Input 1

7
67 23 44 77 24 21 56
Sample Output 1

Youngest=21
Oldest=77 */

//Code

import java.util.*;

public class YoungestandOldest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        int old = arr[0];
        int you = arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>old){
                old = arr[i];
            }
            if(arr[i]<you){
                you = arr[i];
            }
        }
        System.out.println("Youngest="+you);
        System.out.println("Oldest="+old);
        sc.close();
    }
}
