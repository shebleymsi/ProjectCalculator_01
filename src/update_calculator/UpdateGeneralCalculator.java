package update_calculator;

import java.util.Scanner;

public class UpdateGeneralCalculator {

    public static void main(String[] args) {
        doAddition();
        doSubtraction();
        doMultiplication();
        doDivision();
        doSqrt();
        doAbsValue();
    }
    public static void doAddition() {
        Scanner doAdd = new Scanner(System.in);
        System.out.print("Please enter first number for addition : ");
        int number1 = doAdd.nextInt();
        System.out.print("Please enter next number to be added by : ");
        int number2 = doAdd.nextInt();
        int add = number1 + number2;
        System.out.println("Total summation is : "+add);
    }
    public static void doSubtraction() {
        Scanner doSub = new Scanner(System.in);
        System.out.print("Please enter first number for subtraction : ");
        int number3 = doSub.nextInt();
        System.out.print("Please enter next number to be subtracted by : ");
        int number4 = doSub.nextInt();
        int sub = number3 - number4;
        System.out.println("Total subtractions is : "+sub);
    }
    public static void doMultiplication() {
        Scanner doMulti = new Scanner(System.in);
        System.out.print("Please enter first number for Multiplication : ");
        double number5 = doMulti.nextDouble();
        System.out.print("Please enter next number to be multiply by : ");
        double number6 = doMulti.nextDouble();
        double multiply = number5 * number6;
        System.out.println("Total multiplication is : "+multiply);
    }
    public static void doDivision() {
        Scanner doDivided = new Scanner(System.in);
        System.out.print("Please enter first number for division : ");
        int number7 = doDivided.nextInt();
        System.out.print("Please enter next number to be divided by : ");
        double number8 = doDivided.nextDouble();
        double Divided = number7 / number8;
        System.out.println("Total division  is : " + Divided);
    }
    public static void doSqrt() {
        Scanner doSqrt = new Scanner(System.in);
        System.out.print("Please enter the number for Square root : ");
        double number9 = Math.sqrt(doSqrt.nextDouble());
        System.out.println("The square root is : " + number9);
    }
    public static void doAbsValue() {
        Scanner doAbs = new Scanner(System.in);
        System.out.print("Please enter the positive/negative number for Absolute value : ");
        double number10 = Math.abs(doAbs.nextDouble());
        System.out.println("The absolute value is : " + number10);
    }
}
