/*Given a matrix, and we have to check whether the matrix is a sparse matrix or not.

Explanation for sparse matrix:A sparse matrix is a matrix in which most of the elements are zero.
Input Format

First input consists of row and column size.
Secong input consists of array elements.
Constraints

No Constraints

Output Format

Execute the statement based the question conditions

Sample Input 0

3
4 5 6
7 0 0
0 0 0
Sample Output 0

Matrix is a Sparse Matrix
Sample Input 1

4
1 2 3 4
6 7 8 9
1 2 3 0
6 7 7 4
Sample Output 1

Matrix is not a Sparse Matrix */
import java.util.*;
public class nine4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zero=0;
        int nonzero=0;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                    zero++;
                }else{
                    nonzero++;
                }
            }
        }
        if(zero>nonzero){
            System.out.println("Matrix is a Sparse Matrix");
        }else{
        System.out.println("Matrix is not a Sparse Matrix");
        }
    }
}
