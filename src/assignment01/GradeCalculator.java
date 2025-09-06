import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("CSE 1301 Grade for: ");
        String name = scan.next();
        System.out.print("Number of studio sessions attended: ");
        int sessions = scan.nextInt();
        System.out.print("Average quiz grade: ");
        double quizAvg = scan.nextDouble();
        System.out.print("Average exam grade: ");
        double examAvg = scan.nextDouble();
        double finalGrade = ((sessions/8.0)*15 + quizAvg*.25 + examAvg*.60);
        System.out.print("Total grade: " + finalGrade + "%");
        



}
}