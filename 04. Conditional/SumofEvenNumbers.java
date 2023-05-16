/* 
 till N

Given a number N, print sum of all even numbers from 1 to N.
Input Format :
Integer N
Output Format :
Required Sum 
Sample Input 1 :
 6
Sample Output 1 :
12
*/
import java.util.*;

class SumofEvenNumbers{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int sum = 0;

            int d = 2;
            while (d<=n) 
            {
                sum = sum +d;
                d+=2;   
            }
            System.out.println(sum);
        }
    }
}
