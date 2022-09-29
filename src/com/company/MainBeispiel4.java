package com.company;

import java.util.Scanner;

public class MainBeispiel4 {
    public static void main(String[] args) {
        String inputCalc;
        String inputOp;
        Number erg = null;
        double xa = 0;
        double xb = 0;
        double ya = 0;
        double yb = 0;

        RationalCalculator rationalCalculator = rationalCalc();
        VectorCalculator vectorCalculator = vectorCalc();

        Scanner s = new Scanner(System.in);

        do{
            inputCalc = menu1(s);
            if(inputCalc.equals("4")){
                return;
            }

            System.out.print("Enter number x a>");
            xa = s.nextDouble();
            System.out.print("Enter number x b>");
            xb = s.nextDouble();
            System.out.print("Enter number y a>");
            ya = s.nextDouble();
            System.out.print("Enter number y b>");
            yb = s.nextDouble();
            Number x = new Number();
            x.setA(xa);
            x.setB(xb);
            Number y = new Number();
            y.setA(ya);
            y.setB(yb);

            inputOp = menu3(s);

            switch (inputCalc){
                case "1":
                    switch (inputOp) {
                        case "1":
                            erg = rationalCalculator.add(x, y);
                            break;
                        case "2":
                            erg = rationalCalculator.substract(x, y);
                            break;
                        case "3":
                            erg = rationalCalculator.multiply(x, y);
                            break;
                        case "4":
                            erg = rationalCalculator.divide(x, y);
                            break;
                        case "5":
                            continue;
                        default:
                            System.out.println("Ungültige Zahl");
                    }
                    break;
                case "2":
                    switch (inputOp) {
                        case "1":
                            erg = vectorCalculator.add(x, y);
                            break;
                        case "2":
                            erg = vectorCalculator.substract(x, y);
                            break;
                        case "3":
                            erg = vectorCalculator.multiply(x, y);
                            break;
                        case "4":
                            erg = vectorCalculator.divide(x, y);
                            break;
                        case "5":
                            continue;
                        default:
                            System.out.println("Ungültige Zahl");
                    }
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Ungültige Zahl");
            }
            System.out.println(erg);
        }while(true);
    }

    public static String menu3(Scanner s){
        String inputOp;
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - substract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter number again");
        inputOp = s.next();
        return  inputOp;
    }

    public static String menu1(Scanner s){
        String inputCalc;
        System.out.println("Choose calculator:");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("4 - Exit program");
        inputCalc = s.next();
        return  inputCalc;
    }

    public static RationalCalculator rationalCalc(){
        CalculationOperation add = (n,m)->{
            double number1 = n.getA() + m.getA();
            double number2 = n.getB() + m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation subtract = (n,m)->{
            double number1 = n.getA() - m.getA();
            double number2 = n.getB() - m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation multiply = (n,m)->{
            double number1 = n.getA() * m.getA();
            double number2 = m.getB()* n.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation divide = (n,m)->{
            double number1 = n.getA() / m.getA();
            double number2 = m.getB() / n.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        RationalCalculator rationalCalculator = new RationalCalculator(add, subtract, multiply, divide);
        return rationalCalculator;
    }
    public static VectorCalculator vectorCalc(){
        CalculationOperation add = (n,m)->{
            double number1 = n.getA() + m.getA();
            double number2 = n.getB() + m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation subtract = (n,m)->{
            double number1 = n.getA() - m.getA();
            double number2 = n.getB() - m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation multiply = (n,m)->{
            double number1 = n.getA() * m.getB();
            double number2 = m.getA() * n.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        CalculationOperation divide = (n,m)->{
            double number1 = n.getA() * m.getB();
            double number2 = m.getA() * n.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };
        VectorCalculator vectorCalculator = new VectorCalculator(add, subtract, multiply, divide);
        return vectorCalculator;
    }
}
