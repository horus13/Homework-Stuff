import javax.swing.*;

import java.util.Scanner;

        //Problema 13 - Se citesc numere naturale pânã când se introduce numãrul 0. Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.

public class P13 {

    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {

        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }


    public static String readStringGUI(String label) {

        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }

    // CONSOLE
    public static String readStringConsole(String label) {

        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {

        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {

        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {

        System.out.println(text);
    }

    public static void printConsole(int text) {

        System.out.println(text);
    }

    public static void printConsole(double text) {

        System.out.println(text);
    }

    /* end of utility methods*/

    public static void main(String[] arguments) {

        int a = readIntGUI("Enter another number:");
        int sum=0;
        while (a!=0) {

            if (a>4 && a<11)
                sum=sum+a;

            a = readIntGUI("Enter another number:");




        }
        printGUI("You have entered: " + a +" and the current sum is: " + sum);

    }
}