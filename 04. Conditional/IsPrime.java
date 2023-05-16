import java.util.*;

class IsPrime{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int d = 2;
            while(d<=n-1){
                if (n%d == 0) {
                   System.out.println("Not Prime"); 
                   return;  
                }
                d = d+1;
            }
        }
        System.out.println("Prime");
    }
}