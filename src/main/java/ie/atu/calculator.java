package ie.atu;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args){

        subtract();
    }

    public static void subtract()
    {
        System.out.println("please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("please enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("the total is " + total);

    }
    public static void delete()
    {

    }
}