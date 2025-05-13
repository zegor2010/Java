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

        public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
        }
        public static void printPentagonalNumber(int n) {
        for(int i = 1; i<=n; i++){
            System.out.print(String.format("%7d", getPentagonalNumber(i)));
            if(i%10 == 0)
                System.out.println();
        }
        }
        public static long sumDigits(long n) {
        long i = 0;
        long sum = 0;
        while(n != 0){
            i = n%10;
            sum = sum + i;
            n = n/10;
        }
        return sum;
        }
        public static int reverse(int number) {
        int i = 0;
        int reverse = 0;
        while(number != 0) {
            i = number%10;
            reverse = reverse * 10 + i;
            number = number/10;
        }
        return reverse;
        }
        public static void randomMasiv(int masiv[]){
            for (int i = 0; i < masiv.length; i++){
                masiv[i] = (int) (Math.random() * 100);
            }
        }
        public static void printMasiv(int masiv[]) {
            for (int i = 0; i < masiv.length; i++) {
                System.out.print(masiv[i] + " ");
            }
            System.out.println();
        }
        public static int findSumMasiv(int masiv[]){
            int sum = 0;
            for (int i = 0; i<masiv.length; i++){
                sum += masiv[i];
            }
            return sum;
        }
    }

