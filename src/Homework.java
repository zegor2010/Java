import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        random_number();
        algebra();
    }
    public static void algebra () {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();
        double equation = b * b - (4 * a * c);
        double root1 = ((-b + Math.pow(equation, 0.5)) / 2 * a);
        double root2 = ((-b - Math.pow(equation, 0.5)) / 2 * a);
        if (equation == 0)
            System.out.println(root1);
        else if (equation > 0)
            System.out.println(root1 + " and " + root2);
        else System.out.println("The equation has no real roots");
    }


        public static void random_number (){
            int randomInt = (int) (Math.random() * 12) + 1;
            switch (randomInt) {
                case 1:  System.out.println("January"); break;
                case 2:  System.out.println("February"); break;
                case 3:  System.out.println("March"); break;
                case 4:  System.out.println("April"); break;
                case 5:  System.out.println("May"); break;
                case 6:  System.out.println("June"); break;
                case 7:  System.out.println("July"); break;
                case 8:  System.out.println("August"); break;
                case 9:  System.out.println("September"); break;
                case 10: System.out.println("October"); break;
                case 11: System.out.println("November"); break;
                case 12: System.out.println("December"); break;
            }
        }
    }

