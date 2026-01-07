package com.engineerAnsh.java_1;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Map;

public class printMethods {
    public static void main(String[] args){
        // Printing methods :
        // 1. println() method :-
//        System.out.println(1);
//        System.out.println('x');
//        System.out.println();
//        System.out.println("HELLO");
//        int a = 10;
//        int b = 5;
//        String c = "sum";
//        System.out.println(c+a+b); // printing:- sum 10 5
//        System.out.println(c + " of " + a + " & " + b + " : " +(a+b));

        // 2. print() method :-
//        System.out.print(1);
//        System.out.print('x');
//        System.out.print("HELLO");
//        System.out.print(c + " of " + a + " & " + b + " : " +(a+b) +"\n");

        // 3. Printf() method:-

//        int a = 10;
//        int b = 5;
//        String c = "sum";
//        System.out.printf(c + " of " + a + " & " + b + " : " +(a+b) + "\n"); // this is known as 'string concatenation' (means we should use the format specifier method which is present in printf() instead of this)

//        format specifier methods
//        System.out.printf("%s of %d & %d : %d" ,c,a,b,(a+b));
        float d= 1.20f;
        char ch = 'S';
//        System.out.printf("%f %c",d,ch); // %f :- it by default gives 6 zeros after decimal end no...
//        System.out.printf("%.2f %c",d,ch); // n % f :- n is the no. of digits you want after decimal..
//        System.out.printf("%e ",d); // %e :- represents no in exponential form..

        // locales in printf() :
        double number = 1234567.89;
        System.out.printf("Default locale : %,.2f%n " , number); // default locale
        System.out.printf(Locale.US ,"US locale : %,.2f%n " , number); // US locale - means print in US style
        System.out.printf(Locale.GERMAN ,"German locale : %,.2f%n " , number); // German locale - means print in GERMAN style
        System.out.printf(Locale.FRANCE ,"France locale : %,.2f%n " , number); // France locale - means print in FRANCE style
    }
}
