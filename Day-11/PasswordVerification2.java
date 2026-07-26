/* The function accepts string str of size n as an argument. Could you implement the function that returns 1 if the given string str is a valid password else 0? str is a valid password if it satisfies the conditions below.

– At least 4 characters – At least one numeric digit – At Least one Capital Letter – Must not have space or slash (/) – Starting character must not be a number Assumption: Input string will not be empty.

Input Format

Input 1: aA1_67

Input 2: a987 abC012

Constraints

No Constraints

Output Format

Output 1: Your Password is Valid

Output 1: Your Password is Valid

Sample Input 0

abX_098
Sample Output 0

Your Password is Valid
Sample Input 1

Ax9
Sample Output 1

Your Password is Invalid */

//Code

//import java.io.*;
import java.util.*;


public class PasswordVerification2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int u=0;
        int d=0;
        boolean v = true;
        if(str.length()<4){
            v = false;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            //char ch = str.charAt(i);
            v = false;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' ' || ch=='/'){
                v=false;
                break;
            }
            if(ch>='A' && ch<='Z'){
                u++;
            }
            if(ch>='0' && ch<='9'){
                d++;
            }
        }
        if(v && u>=1 && d>=1){
            System.out.print("Your Password is Valid");
        } else {
            System.out.print("Your Password is Invalid");
        }
        sc.close();
    }
}
