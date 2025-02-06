import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //learnSection1();

        //mortgageCalculator();

        learnSection2();
    }

    public static void learnSection1()
    {
        System.out.println("Hello, World!!!");

        // Primitive types
        byte age = 26; // 1 byte = [-128,127]
        short viewsCount = 3_000; // 2 bytes
        int count = 2_000_000_000; // 4 bytes
        long number = 4_300_000_000L; // cast from int by default to long.
        float price = 10.99F; // cast from double by default to float.
        double amount = 10.99;
        char letter = 'L';
        boolean isEligible = true;


        // Reference types
        Date now = new Date();
        System.out.println("now:" + now);
        Point point1 = new Point(1, 1);
        System.out.println("point1:" + point1);


        System.out.println();
        // Strings
        String name = "Lior Barak";
        System.out.println("my name is: " + name);
        System.out.println(name.endsWith("Barak"));
        System.out.println(name.startsWith("Barak"));
        System.out.println(name.length());
        System.out.println(name.indexOf("G"));
        System.out.println(name.replace("L", "l"));
        System.out.println(name.replace("B", "b"));
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        name = "  " + name + "  ";
        System.out.println(name);
        System.out.println(name.trim());


        System.out.println();
        // Escape characters
        String name2 = "\"Aviv Barak\"";
        System.out.println(name2);
        String location = "C:\\Windows\\...";
        System.out.println(location);
        String sentence = "Hi Lior \nHow are you?";
        System.out.println(sentence);
        sentence = "Hi Lior \tHow are you?";
        System.out.println(sentence);


        System.out.println();
        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // based on the memory address.
        String arrayToPrint = Arrays.toString(numbers);
        System.out.println(arrayToPrint);
        int[] numbers2 = {2, 3, 5, 1, 4};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));


        System.out.println();
        // Multi-dimensional arrays
        int[][] matrix1 = new int[2][3];
        matrix1[0][0] = 10;
        System.out.println(Arrays.deepToString(matrix1));
        int[][][] matrix2 = new int[2][3][5];
        matrix2[0][0][0] = 10;
        System.out.println(Arrays.deepToString(matrix2));
        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix3));


        System.out.println();
        // Constants
        final float pi = 3.14F;
        //pi = 1; // Error: cannot assign a value to final variable pi


        System.out.println();
        // Arithmetic expressions
        double result = (double)10 / (double)3;
        System.out.println(result);
        int x = 1;
        int y = x++; // postfix VS prefix
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        System.out.println();
        // Casting
        String strX = "1";
        int intX = Integer.parseInt(strX) + 2;
        System.out.println(intX);
        String strX2 = "1.1";
        double doubleX = Double.parseDouble(strX2) + 2; // 2.0
        System.out.println(doubleX);


        System.out.println();
        // Math class
        int mathX = (int)Math.round(1.1);
        System.out.println(mathX);
        mathX = (int)Math.ceil(1.1);
        System.out.println(mathX);
        mathX = (int)Math.floor(1.1);
        System.out.println(mathX);
        mathX = (int)Math.max(100, 200);
        System.out.println(mathX);


        System.out.println();
        // formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultNF = currency.format(1234567.891);
        System.out.println(resultNF);
        NumberFormat precent = NumberFormat.getPercentInstance();
        String resultNF2 = precent.format(0.3);
        System.out.println(resultNF2);
        String resultNF3 = NumberFormat.getPercentInstance().format(0.3); // another way to do the same.
        System.out.println(resultNF3);


        System.out.println();
        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String stringScan = scanner.nextLine().trim();
        System.out.println("You are " + stringScan);
    }

    public static void mortgageCalculator()
    {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mortgage Calculator");
        System.out.println("-------------------");

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT; // for example: 3.92% -> 0.0392

        System.out.print("Period (Years): ");
        int periodYears = scanner.nextInt();
        int periodMonths = periodYears * MONTHS_IN_YEAR;

        double mortgage = principal
                * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodMonths)
                / (Math.pow(1 + monthlyInterestRate, periodMonths) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

    public static void learnSection2()
    {

    }
}