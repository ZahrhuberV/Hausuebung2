package com.company;

public class Main {

    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("test.txt");

        numberTester.setOddEvenTester((n) -> (n % 2) == 0);
        numberTester.setPrimeTester((n) -> {
            if (n <= 1)
                return false;

            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        });
        numberTester.setPalindromeTester((n) -> {
            String reverse = new StringBuffer(n + "").reverse().toString();
            return (n + "").equals(reverse);

        });
        numberTester.testFile();
    }
}
