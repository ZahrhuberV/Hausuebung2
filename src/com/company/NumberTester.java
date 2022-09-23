package com.company;

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

    }


}
