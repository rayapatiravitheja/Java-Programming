/*Write a program to find the sum of boundaries of a given matrix

Input Format

first input corresponds to the array size of row and column.
second input corresponds to the array elements.
Constraints

No Constraints

Output Format

print the sum of boundaries value.
Sample Input 0

3
3
5 8 2
3 6 8
1 5 9
Sample Output 0

Sum of boundary is 41
Sample Input 1

5
5
1 3 6 9 3
-5 7 2 8 1
4 8 0 2 5
-11 5 7 2 8
2 5 13 25 30
Sample Output 1

Sum of boundary is 99 */
import java.util.*;
public class nine1{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //int n=sc.nextInt();
       int row=sc.nextInt();
       int col=sc.nextInt();
       int arr[][]=new int[row][col];
       int sum=0;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
       }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of boundary is "+sum);
    }
}

