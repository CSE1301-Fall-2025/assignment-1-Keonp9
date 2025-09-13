import java.util.Scanner;
public class Nim {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Choose number of starting sticks: ");
    int sticks = scan.nextInt();
    int num = 0;
    while (sticks > 0) {
        String round = ("Round " + num);
        System.out.print("Choose number of sticks to remove: ");
        int a = scan.nextInt();
        System.out.println("Round " + round + ": " + sticks + " at start, " + a + " taken by human, " + (sticks-a) + " remain.");
        sticks -= a;
        if (sticks > 0){
            int b = 0;
            if (sticks >= 2){
                double rand = Math.random();
                if (rand > 0.5){
                    b = 2;
                } else {
                    b = 1;
            }
            } else {
            b = 1;
            }
        System.out.println("Round " + round + ": " + sticks + " at start, " + b + " taken by computer, " + (sticks-b) + " remain.");
        sticks -= b;
        num++;
        if (sticks == 0){
            System.out.println("COMPUTER WINS");
        }
    } else {
        System.out.println("HUMNAN WINS");
    }
}
}
}
