import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scan.nextInt();
        System.out.println("Enter second number:");
        int second = scan.nextInt();
        System.out.println(first);
        System.out.println(second);
        int next = first + second;
        while (next <=1000) {
            System.out.println(next);
            first = second;
            second = next;
            next = first + second;
        }
    }
}