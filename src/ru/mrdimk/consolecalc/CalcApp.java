package ru.mrdimk.consolecalc;

import java.util.Scanner;

public class CalcApp {

    private static boolean exitFlag;
    private String expression;

    public static void main(String[] args) {
        CalcApp application = new CalcApp();
        application.init();

        while (!exitFlag) {
            application.readCommand();
            application.writeAnswer();
        }

        application.closeApp();
    }

    private void init(){
        exitFlag=false;
        expression = "0";
        System.out.println("Welcome! To make simple calc, enter expression, to exit enter 'q'.");
    }

    private void readCommand(){
        Scanner scan = new Scanner(System.in);
        expression = scan.nextLine();
        if (expression.equals("q")) exitFlag = true;
    }

    private void writeAnswer(){
        System.out.println("Expression is: "+ expression);
    }

    private void closeApp(){
        System.out.printf("goodbye!");
    }

}
