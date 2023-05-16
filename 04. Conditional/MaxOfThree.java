import java.util.*;

class MaxOfThree{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a>=b && a>=c) {
                System.out.println(a);   
            }
            else if (b>=a && b>c) {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }

}