package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {

    private String filename;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester ( String fileName ) {
        this.filename = fileName;
    }

    public void setOddEvenTester (NumberTest oddTester ) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester ( NumberTest primeTester ) {
        this.primeTester = primeTester ;
    }
    public void setPalindromeTester ( NumberTest palindromeTester ) {
        this.palindromeTester = palindromeTester ;
    }
    public void testFile ( ) {
        try {
            Scanner s = new Scanner(new File(filename));
            boolean isfirst = true;
            while(s.hasNextLine()){
                String line = s.nextLine();
                if(isfirst){
                    isfirst = false;
                    continue;
                }
                String[] parts = line.split(" ");
                switch (parts[0]) {
                    case "1": if(oddTester.testNumber(Integer.parseInt(parts[1]))){
                        System.out.println("ODD");
                    } else System.out.println("EVEN");
                        break;
                    case "2": if(primeTester.testNumber(Integer.parseInt(parts[1]))){
                        System.out.println("PRIME");
                    } else System.out.println("NO PRIME");
                        break;
                    case "3": if(palindromeTester.testNumber(Integer.parseInt(parts[1]))){
                        System.out.println("PALINDROME");
                    } else System.out.println("NO PALINDROME");
                        break;
                    default:
                        System.out.println("Keine Richtige Zahl");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
