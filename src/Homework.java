import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        random_number();
        algebra();
    }

    public static void algebra() {
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

    public static void random_number() {
        int randomInt = (int) (Math.random() * 12) + 1;
        switch (randomInt) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void printPentagonalNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("%7d", getPentagonalNumber(i)));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static long sumDigits(long n) {
        long i = 0;
        long sum = 0;
        while (n != 0) {
            i = n % 10;
            sum = sum + i;
            n = n / 10;
        }
        return sum;
    }

    public static int reverse(int number) {
        int i = 0;
        int reverse = 0;
        while (number != 0) {
            i = number % 10;
            reverse = reverse * 10 + i;
            number = number / 10;
        }
        return reverse;
    }

    public static void randomMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100);
        }
    }

    public static void printMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }

    public static int findSumMassive(int[] massive) {
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }
        return sum;
    }

    public static int[] copyMassive(int[] massive) {
        int[] massive1 = new int[massive.length];
        for (int i = 0; i < massive.length; i++) {
            massive1[i] = massive[i];
        }
        return massive1;
    }

    public static void comparing() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[11];
        System.out.println("Enter 11 integers: ");
        for (int i = 0; i < 11; i++) {
            numbers[i] = scanner.nextInt();
        }
        int lastNumber = numbers[10];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > lastNumber) {
                System.out.println((i + 1) + ":" + " is greater.");
            } else if (numbers[i] == lastNumber) {
                System.out.println((i + 1) + ":" + " is equal.");
            } else {
                System.out.println((i + 1) + ":" + " is smaller.");
            }
        }
    }

    public static void countOddAndEven() {
        int evenNumbers = 0;
        int oddNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end the program with 0): ");
        while (true) {
            int numbers = scanner.nextInt();
            if (numbers == 0) break;
            if (numbers % 2 == 0) evenNumbers++;
            else oddNumbers++;
        }
        System.out.println("Number of even numbers: " + evenNumbers);
        System.out.println("Number of odd numbers: " + oddNumbers);
    }

    public static void countSingleDigits() {
        int[] counts = new int[10];
        for (int i = 0; i < 200; i++) {
            int randomInt = (int) (Math.random() * 10);
            counts[randomInt]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i] + " times");
        }
    }

    public static int intAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double doubleAverage(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double max(double[] array) {
        double highest = array[0];
        for (double numbers : array) {
            if (numbers > highest) {
                highest = numbers;
            }
        }
        System.out.println("The highest number: " + highest);
        return highest;
    }

    public static void sortIncrease(double[] massive) {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 1; j < massive.length; j++) {
                if (massive[i] < massive[j]) {
                    double temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }
            }
        }
    }

    public static void sortDecrease(double[] massive) {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 1; j < massive.length; j++) {
                if (massive[i] > massive[j]) {
                    double temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }
            }
        }
    }

    public static void sortMassive(double[] massive, boolean sort){
        if (sort){
            sortIncrease(massive);}
        else {
            sortDecrease(massive);}
    }

    public static int leanerSearch(double[] numbers, double target){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return 0;
    }

    public static int binarySearch(double[] numbers, double target){
        sortIncrease(numbers);
        int start = 0, end = numbers.length - 1;
        int mid = (start + end) / 2;
        while (start <= end){
            mid = (start + end) / 2;
            if (numbers[mid] == target){
                return mid;}
            if (numbers[mid] < target){
            }
        }
    return mid;
    }

    public static int indexOfLargestElement(double[] array) {
        int largestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[largestIndex]) {
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static double findMean(double[] x){
        double sum = 0;
        for(double num : x){
            sum = sum + num;
            double mean = sum / x.length;
        }
        return mean;
    }

    public static double deviation(double[] x){
    return 0;
    }

    public static int[] reverseArray(){
        Scanner input = new Scanner(System.in);
        int[] reversedArray = ;
        return reversedArray;
    }

    public static int getRandom(int[] numbers){
    return 0;
    }

    public static int lcm(int[] numbers){
    return 0;
    }

    public static int[] eliminateDuplicates(int[] list){
    }

    public static boolean isSorted(int[] list){
        int[] sorted = sortDecrease(new int[] list);
        if(isSorted(int[] list) == sorted){
            return true;
        }
    }
}
