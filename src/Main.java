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

        //compoundInterestCalculator();

        //useStringMethods();

        //weightConverter();

        //temperatureConverter();

        //useEnhancedSwitch();

        //calculator();

        //numberGuessingGame();

        //matrixOfSymbol();

        //bankingProgram();

        //diceRollerProgram();

        //useArrays();

        //useVarArgs();

        telephone2DArray();
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

    public static void useStringMethods()
    {
        String name = "Lior Barak";
        int length = name.length();
        char letter = name.charAt(5);
        int index = name.indexOf('B'); // First index of 'B'
        int lastIndex = name.lastIndexOf('a'); // Last index of 'a'

        System.out.printf("string is: %s \nit's length is: %d\n", name, length);
        System.out.println("letter at index 5 is: " + letter);
        System.out.println("index of 'B' is: " + index);
        System.out.println("last index of 'a' is: " + lastIndex);

        name = name.toUpperCase();
        System.out.println("name in upper case: " + name);
        name = name.toLowerCase();
        System.out.println("name in lower case: " + name);

        name = "    Lior Barak    ";
        System.out.println("name with spaces: " + name);
        name = name.trim();
        System.out.println("name without spaces: " + name);

        name = name.replace('a', 'o');
        System.out.println("name with replaced 'a' to 'o': " + name);

        System.out.println("name is empty?: " + name.isEmpty());
        if (name.isEmpty())
            System.out.println("Your name is empty");
        else
            System.out.println("Your name is not empty");

        if (name.contains(" "))
            System.out.println("Your name contains a space");
        else
            System.out.println("Your name does not contain a space");

        if (name.equalsIgnoreCase("password"))
            System.out.println("Your name can't be password");
        else
            System.out.println("Hello " + name);
    }

    public static void weightConverter()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Converter");
        System.out.println("----------------");

        System.out.println("Option 1. convert from LBS to KG");
        System.out.println("Option 2. convert from KG to LBS");
        System.out.print("Choose an option (1/2): ");
        int choice = scanner.nextInt();

        double weight;
        double newWeight;
        if (choice == 1)
        {
            System.out.print("Enter your weight in LBS: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in KG is: %.2f\n", newWeight);
        }
        else if(choice == 2)
        {
            System.out.print("Enter your weight in KG: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("Your weight in LBS is: %.2f\n", newWeight);
        }
        else
        {
            System.out.println("Invalid choice");
        }


        scanner.close();
    }

    public static void temperatureConverter()
    {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;
        System.out.printf("The new temperature is: %.1f%s", newTemperature, unit);

        scanner.close();
    }

    public static void useEnhancedSwitch()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        String dayType = switch(day)
        {
            case "Sunday","Monday", "Tuesday", "Wednesday", "Thursday" ->
                    "weekday";
            case "Friday", "Saturday" ->
                    "weekend";
            default ->
                    "invalid day";
        };

        System.out.println("The day is a/n " + dayType);

        /*
        switch(day) // Another option to use enhanced switch
        {
            case "Sunday","Monday", "Tuesday", "Wednesday", "Thursday"
                    -> System.out.println("weekday");
            case "Friday", "Saturday" ->
                    System.out.println("weekend");
            default ->
                    System.out.println("Invalid day");
        }

        switch(day) // The regular switch statement
        {
            case "Sunday":
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("weekday");
                break;
            case "Friday":
            case "Saturday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        */

        scanner.close();
    }

    public static void calculator()
    {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("\nCalculator");
        System.out.println("----------\n");

        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        switch (operator)
        {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' ->
            {
                if (number2 == 0)
                {
                    System.out.println("Cannot divide by zero!");
                    validOperator = false;
                } else
                {
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default ->
            {
                System.out.println("Invalid operator!");
                validOperator = false;
            }
        }

        if (validOperator)
        {
            System.out.printf("The result is: %.2f", result);
        }

        scanner.close();
    }

    public static void numberGuessingGame()
    {
        Scanner scanner = new Scanner(System.in);
        Random randomMachine = new Random();

        System.out.println("\nNumber Guessing Game!");
        System.out.println("---------------------\n");

        int guess;
        int attempts = 0;
        int minBound;
        int maxBound;

        System.out.print("Enter the min bound: ");
        minBound = scanner.nextInt();
        System.out.print("Enter the max bound: ");
        maxBound = scanner.nextInt();
        int randomNumber = randomMachine.nextInt(minBound, maxBound + 1);

        System.out.printf("Guess a number between %d-%d\n", minBound, maxBound);
        do
        {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber)
            {
                System.out.println("TOO LOW! Try again");
            }
            else if (guess > randomNumber)
            {
                System.out.println("TOO HIGH! Try again");
            }

        } while (guess != randomNumber);

        System.out.println("Congrats!");
        System.out.println("You guessed the number " + randomNumber + " in " + attempts +" attempts");

        scanner.close();
    }

    public static void matrixOfSymbol()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMatrix of Symbol");
        System.out.println("----------------\n");

        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();
        System.out.print("Enter the symbol you want to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(symbol + " ");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void bankingProgram()
    {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("\nBanking Program");
        System.out.println("---------------");

        while (isRunning)
        {
            System.out.println("Welcome to the bank!");
            System.out.println("*********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*********************");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(scanner);
                case 3 -> balance -= withdraw(scanner, balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }

            System.out.println();
        }

        System.out.println("Thank you! Have a nice day!");

        scanner.close();
    }

    private static void showBalance(double balance)
    {
        System.out.printf("Your Balance is: $%.2f\n", balance);
    }

    private static double deposit(Scanner scanner)
    {
        System.out.print("Enter an amount to be deposited: ");
        double amountToDeposit = scanner.nextDouble();

        if (amountToDeposit < 0)
        {
            System.out.println("Invalid amount to deposit!");
            return 0;
        }

        System.out.printf("You have deposited: $%.2f\n", amountToDeposit);

        return amountToDeposit;
    }

    private static double withdraw(Scanner scanner, double balance)
    {
        System.out.print("Enter an amount to be withdrawn: ");
        double amountToWithdraw = scanner.nextDouble();

        if (amountToWithdraw > balance)
        {
            System.out.println("Insufficient funds!");
            return 0;
        }
        else if (amountToWithdraw < 0 )
        {
            System.out.println("Invalid amount to withdraw!");
            return 0;
        }

        System.out.printf("You have withdrawn: $%.2f\n",amountToWithdraw);

        return  amountToWithdraw;
    }

    public static void diceRollerProgram()
    {
        Scanner scanner = new Scanner(System.in);
        Random randomMachine = new Random();

        int numberOfDice;
        int total = 0;

        System.out.println("\nDice Roller Program");
        System.out.println("-------------------\n");

        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();

        if (numberOfDice > 0)
        {
            for (int i = 0; i < numberOfDice; i++)
            {
                int roll = randomMachine.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else
        {
            System.out.println("Number of dice must be greater than 0!");
        }


        scanner.close();
    }

    private static void printDie(int roll)
    {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll)
        {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }

    public static void useArrays()
    {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
        int length = fruits.length;

        for (int i = 0; i < length; i++)
        {
            System.out.println(fruits[i]);
        }

        System.out.println();
        for (String fruit : fruits) // Enhanced for loop == for-each loop
        {
            System.out.println(fruit);
        }

        System.out.println();
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


        System.out.println();
        System.out.print("What number of food do you want?: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // To consume the '\n' character left by nextInt()!!!

        String[] foods = new String[size];

        for (int i = 0; i < foods.length; i++)
        {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods)
        {
            System.out.println("food: " + food);
        }
        scanner.close();
    }

    public static void useVarArgs()
    {
        System.out.println("The sum of numbers 1-6 is: " + useVarArgsToAdd(1, 2, 3, 4, 5, 6));
        System.out.println("The average of numbers 1-6 is: " + useVarArgsToAverage(1, 2, 3, 4, 5, 6));
    }

    private static int useVarArgsToAdd(int... numbers)
    {
        int sum = 0;

        for (int number : numbers)
        {
            sum += number;
        }

        return sum;
    }

    private static int useVarArgsToAverage(int... numbers)
    {
        int sum = 0;

        if (numbers.length == 0)
        {
            return 0;
        }

        for (int number : numbers)
        {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void telephone2DArray()
    {
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for (char[] row : telephone)
        {
            for (char digit : row)
            {
                System.out.print(digit + " ");
            }

            System.out.println();
        }
    }

    public static void section37()
    {

    }

    public static void section38()
    {

    }

    public static void section39()
    {

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