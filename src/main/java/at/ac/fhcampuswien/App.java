package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("           __");
        System.out.println("  _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("    \\___|----|  |   __");
        System.out.println("     \\  }{ /\\ )_ / _\\");
        System.out.println("     /\\__/\\ \\__O (__");
        System.out.println("    (--/\\--)    \\__/");
        System.out.println("    _)( )(_");
        System.out.println("   `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        jar= 'Z';
        int hexVal = 0xface;
        int=012;
        long=80L;
        float=44e-1f;
        float=5.5f;
        8.88e1;
        int=99.9;



    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num1 = Scanner(System.in);
        int num2 = Scanner(System.in);
        int sum = num1+num2;
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x:"+x+", y:"+y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner n1 = new Scanner(System.in), n2 = new Scanner(System.in);
        if n1 > n2 println("n1 > n2");

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
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