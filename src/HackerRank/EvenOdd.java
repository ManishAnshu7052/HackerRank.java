package HackerRank;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 != 0) {
            System.out.println(" Wierd");
        } else if (N >= 2 && N <= 5 ) {
            System.out.println("Not Wierd");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Wierd");
        } else  {
            System.out.println("Not Wierd");

        }
    }
}