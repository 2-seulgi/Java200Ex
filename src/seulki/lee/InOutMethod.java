package seulki.lee;
import java.util.Scanner;

// static 메서드
public class InOutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //키보드

        System.out.println("정수를 입력하세요.");
        int choice = sc.nextInt();
        System.out.println(choice);

        System.out.println("실수를 입력하세요.");
        double rchoice = sc.nextDouble();
        System.out.println(rchoice);

        System.out.println("문자열을 입력하세요.");
        String schoice= sc.next();
        System.out.println(schoice);

    }
}
