import java.util.Scanner;

public class conditionalStatements {

    public static void BoilingWater(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        int number = scanner.nextInt();

        String message = (number > 212) ? "Water is boiling!" : "Water is not boiling, increase temperature";
        System.out.println(message);
    }



    public static void NumberComparison(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Enter another number:");
        int number2 = scanner.nextInt();
        if (number == number2) {
            System.out.println("Numbers are the same");
        }
        else if (number > number2) {
            System.out.println("The first number was larger than the second");
        }
        else {
            System.out.println("The second number was greater than the first");
        }

    }
    public static void TestScores(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100:");
        int number = scanner.nextInt();
        if (number > 100 || number < 0) {
            System.out.println("Please enter a number between 0 and 100");
            TestScores(args);
        }
        else if (number <= 100 && number > 90) {
            System.out.println("Your grade is an A :D");
        }
        else if (number <= 90 && number > 80) {
            System.out.println("Your grade is a B :)");
        }
        else if (number <= 80 && number > 70) {
            System.out.println("Your grade is a C :|");
        }
        else if (number <= 70 && number > 60) {
            System.out.println("Your grade is a D :|");
        }
        else if (number <= 60) {
            System.out.println("Your grade is a F :(");
        }


    }
    public static void SameOrNah(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("Enter another word:");
        String word2 = scanner.nextLine();
        if (word.equals(word2)) {
            System.out.println("Words are the same");
        }
        else {
            System.out.println("Words are not the same");
        }
    }



    public static void main(String[] args) {
    BoilingWater(args);
    NumberComparison(args);
    TestScores(args);
    SameOrNah(args);
    }

}