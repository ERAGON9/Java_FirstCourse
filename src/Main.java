import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //javaFullCourseForBeginnersWithMosh();

        javaFullCourseWithBroCode();
    }

    public static void javaFullCourseWithBroCode()
    {
        // link to the course: https://www.youtube.com/watch?v=xTtL8E4LzTQ

        //homeWorkAssignment1();

        //madLibsGame();

        //shoppingChartProgram();

        //useRandom();

        //useMathLibrary();

        //usePrintf();

        compoundInterestCalculator();
    }

    public static void homeWorkAssignment1()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the value of pi: ");
        double pi = scanner.nextDouble();
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.print("Are you an admin in this system? (true/false): ");
        boolean isAdmin = scanner.nextBoolean();

        System.out.println();
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("The value of pi you entered is: " + pi);
        System.out.println("Your gender is: " + gender);
        System.out.println("You an admin in this system? " + isAdmin);

        scanner.close();
    }

    public static void madLibsGame()
    {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println();
        System.out.println("Welcome to the Mad Libs Game!");
        System.out.println("-------------------------------");
        System.out.println();

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb and with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println();
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }

    public static void shoppingChartProgram()
    {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What items would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);

        scanner.close();
    }

    public static void useRandom()
    {
        Random randomMachine = new Random();

        int number = randomMachine.nextInt(1, 7); // number in [1, 6]
        System.out.println("Random number between 1 to 6 is: " + number);

        double number2 = randomMachine.nextDouble(); // number in [0, 1)
        System.out.println("Random number between 0 to 0.9999... is: " + number2);

        boolean isHeads = randomMachine.nextBoolean();
        System.out.println("Random coin flip is Heads: " + isHeads);
    }

    public static void useMathLibrary()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PI is: " + Math.PI);
        System.out.println("E is: " + Math.E);

        int result = (int)Math.pow(2, 6); // also: Math.abs, Math.sqrt, Math.rout, Math.ceil, Math.floor, Math.max, Math.min, Math.random
        System.out.println("2^6 is: " + result);

        double result2 = Math.round(3.49);
        System.out.println("round(3.49) is: " + result2);

        hypotenuseCalculator(scanner);
        circleCalculator(scanner);

        scanner.close();
    }

    private static void hypotenuseCalculator(Scanner scanner)
    {
        System.out.println("\nHypotenuse Calculator");
        System.out.println("---------------------\n");

        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The length of the hypotenuse C: " + c + "cm");
    }

    private static void circleCalculator(Scanner scanner)
    {
        System.out.println("\nCircle Calculator");
        System.out.println("----------------\n");

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference: %.3fcm\n", circumference);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area: %.3fcm^2\n", area);

        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume: %.3fcm^3\n", volume);
    }

    public static void usePrintf()
    {
        // format => %[flag][width][.precision][specifier-character]

        String name = "Lior";
        int age = 26;
        char firstLetter = 'L';
        double height = 1.75;
        boolean isStudent = true;

        //[specifier-character] =>  %s - string,
        //                          %d - int,
        //                          %c - char,
        //                          %f - float/double,
        //                          %b - boolean.
        System.out.printf("Hello %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %.2f meters tall\n", height);
        System.out.printf("Are you a student? %b\n", isStudent);
        System.out.printf("Hello %s You are %d years old, your name start with %c, your height is: %.2f," +
                           " your are a student: %b\n", name, age, firstLetter, height, isStudent);


        // [.precision] => %.2f - 2 decimal points,
        //                 %.3f - 3 decimal points.
        double number1 = 1.23456789;
        System.out.printf("Number1: %.3f\n", number1);


        // [flag] => + = include sign,
        //           , = comma grouping separated,
        //           ( = negative numbers are enclosed in (),
        //           space = display a minus if negative, space if positive.
        double number2 = 99.87;
        double number3 = -99.87;
        System.out.printf("Number2: %+.2f\n", number2);
        System.out.printf("Number3: %+.2f\n", number3);
        double number4 = 10_000.123;
        System.out.printf("Number4: %,.2f\n", number4);

        System.out.printf("Number2: %(.2f\n", number2);
        System.out.printf("Number3: %(.2f\n", number3);

        System.out.printf("Number2: % .2f\n", number2);
        System.out.printf("Number3: % .2f\n", number3);


        // [width] => 0 = zero-padded,
        //            number = right justified padding,
        //            negative number = left justified padding.
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }

    public static void compoundInterestCalculator()
    {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter thr number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is: $%,.2f", years, amount);

        scanner.close();
    }







    public static void javaFullCourseForBeginnersWithMosh()
    {
        // link to the course: https://www.youtube.com/watch?v=eIrMbAQSU34

        //learnSection1();

        mortgageCalculator();

        //learnSection2();

        //fizzBuzz();

        //learnSection3();
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
        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultNF2 = percent.format(0.3);
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

        int principal = 0;
        while (true)
        {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        double annualInterestRate = 0;
        while (true)
        {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT; // for example: 3.92% -> 0.0392

        int periodYears = 0;
        while (true)
        {
            System.out.print("Period (Years): ");
            periodYears = scanner.nextInt();
            if (periodYears >= 1 && periodYears <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        int periodMonths = periodYears * MONTHS_IN_YEAR;

        double mortgage = principal
                * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodMonths)
                / (Math.pow(1 + monthlyInterestRate, periodMonths) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

    public static void learnSection2()
    {
        // comparison operators
        int x = 1;
        int y = 2;

        System.out.println(x > y); // operations: >, <, >=, <=, ==, !=
        System.out.println(x != y);
        System.out.println(x <= y);


        System.out.println();
        // logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // operations: &&, ||, !
        System.out.println(isWarm);
        temperature = 27;
        isWarm = temperature < 20 || temperature > 30;
        System.out.println(isWarm);
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);


        System.out.println();
        // if statements
        int temp = 32;
        if (temp > 30)
        {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
        {
            System.out.println("Beautiful day");
        }
        else
        {
            System.out.println("Cold day");
        }

        int income = 120_000;
        boolean hasHighIncome2 = income > 100_000;
        System.out.println(hasHighIncome2);

        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);


        System.out.println();
        // switch statements
        String role = "admin";
        switch (role) // also can be int, char, byte, short, enum, ...
        {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }

    public static void fizzBuzz()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FizzBuzz");
        System.out.println("--------");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0)
        {
            if (number % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println("Fizz");
            }
        }
        else if (number % 3 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(number);
        }
    }

    public static void learnSection3()
    {
        // for loops
        for(int i = 5; i > 0; i--)
        {
            System.out.println("Hello from for loop index: " + i);
        }


        System.out.println();
        // while loops
        int i = 5;
        while (i > 0)
        {
            System.out.println("Hello from while loop index: " + i);
            i--;
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true)
        {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit"))
                break;
            else if (input.equals("pass"))
                continue;
            System.out.println(input);
        }


        System.out.println();
        // do-while loops
        do
        {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit")); // will run at least once.


        System.out.println();
        // for-each loops
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}