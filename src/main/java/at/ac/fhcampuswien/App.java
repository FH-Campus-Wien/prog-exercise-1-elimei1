package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        char ch = 'Z';
        int hexVal = 0xface;
        int i1 = 012;
        long l = 80L;
        float f1 = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;

        int a = (int) f1;
        int b = (int) f2;
        int c = (int) l;
        int d = (int) d1;
        int e = (int) d2;
        int f = Character.getNumericValue(ch);
        int sum = a + b + c + d + e + f + hexVal + i1;
        System.out.println(sum);


    }

    //todo Task 4
    public void addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers() {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Before Swap:" + System.lineSeparator() + "x: y: ");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:"  );
        System.out.println("x: " + x + System.lineSeparator() + "y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.print("n1: n2: ");
        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
        if (n1 < n2) {
            System.out.println("n2 > n1");
        }
        if (n1 == n2) {
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson() {

        Scanner scanner = new Scanner(System.in);
        int revenue = scanner.nextInt();
        System.out.print("Enter annual Revenue: ");

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue >= 0 && 20000 > revenue) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue >= 20000 && 50000 > revenue) {
            System.out.println("Avarage Sales Revenue");
        } else if (revenue >= 50000 && 80000 > revenue) {
            System.out.println("Good Sales Revenue");
        } else if (revenue >= 80000 && 100000 > revenue) {
            System.out.println("Excellent Sales Revenue");
        }
    }


    //todo Task 8
    public void getCommissionRate() {
        System.out.print("Enter CommissionClass: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        switch (p) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commision Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;

        }
    }

    //todo Task 9
    public void leapyear() {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.print("Year: ");

        if (i % 4 != 0 ) {
            System.out.println("Leapyear");
        } else if (i % 400 != 0) {
           System.out.println("Leapyear");
        }
        else if (i % 100 == 0) {
            System.out.println("Not a Leapyear");
        }
    }





    //todo Task 10
    public int transposedNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int reverse = 0;
        do {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        } while (number > 0);
        System.out.println("Number: " + reverse);
        return reverse;
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
