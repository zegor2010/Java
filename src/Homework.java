import java.util.Scanner;
import java.sql.SQLOutput;

public class Homework {
    public static void Homework(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свій бал");
        int scale = scanner.nextInt();
        int score = 0;
        if(scale > 10)
            score = 3 * scale;
        else
            score = 4 * scale;

        System.out.println("Введіть свій зароботок");
        int income = scanner.nextInt();
        double tax = 0;
        if(income > 10000)
            tax = income * 0.2;
        else
            tax = income * 0.17 + 1000;

        System.out.println("введіть літеру");
        int number = scanner.nextInt();
        if(number % 3 == 0)
            System.out.println("i");
        else
            System.out.println("j");
    }
}
