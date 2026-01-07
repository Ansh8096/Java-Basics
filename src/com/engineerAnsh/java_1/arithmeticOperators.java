package com.engineerAnsh.java_1;

public class arithmeticOperators {
    public static void main(String[] args) {

        // modulus of two numbers...
//        int a = 5;
//        int b = 2;
//        int c = a%b; // modulus (or remainder)
//        System.out.println(c);

        // Basics of addition,subtraction,multiplication and division
//        int salary = 100000;
//        int deduction = 500;
//        int monthlyTotal = salary - deduction;
//        int yearlyTotal = monthlyTotal *12;
//        int perChild = yearlyTotal / 3;
//        System.out.println(monthlyTotal);
//        System.out.println(yearlyTotal);
//        System.out.println(perChild);

        // More to know about :
        // 1. Addition :-

//        int a = 5;
//        double b = 10.1;
////        double c = a + b; // java will automatically take variable dataType as double to prevent any dataLoss...
//        double c_ =  a + 10.1;
//        System.out.println(c_);
//
//        float a1= 12.2f;
//        long b1= 23723;
//        float c1 = a1 + b1; // java will use here float becauz float can represent numbers in scientific notations..
//        System.out.println(c1);

////        int a2 = 438347634;
//        long a2 = 438347634; // now we will get our answer without any loss..
////        int c2 = a2 * 24223; // here we will lost some of our data becauz it exceeds INT_MAX value...
//        long c2 = a2 * 24223; // here we will also lost our data becauz we will again get our data in int beacuz a2 was integer initially..
//        System.out.println(c2);

        // 2. Division :-

        // if both x,y,z are in integer then this will give me answer in whole number.
        // if we take float in z it will not give us our answer in decimal like we want.
        // if we want answer in decimal take float or double datatype in either x or y.
////        int x = 10;
//        float x = 10f;
//        int y = 3;
////        int quotient = x/y;
//        float quotient  = x/y;
//        System.out.println(quotient);
//
//        int x1 = 2;
//        int y1 = x1-2;
//        int z1 = x1/y1;
//        int z_1 = x1%y1;
//        System.out.println(z1); // this will give us exception error becauz we are dividing x1 by zero ...
//        System.out.println(z_1); // this will also give us exception error becauz here also we are  dividing x1 by zero...

        // operator_Precedence :-
//        int  g = 10;
//        g += 10; // it is known as compound assignment operator..,

//        int x2 = 10 , y2 = 5;
//        int result = x2/y2 + 3 * 2 - 1; // it will get solved according to its precedence
//        System.out.println(result);

//        byte byteVal = 10;
////        byteVal = byteVal + 15; // this will give us error because java will read 15 as integer (which means we have changed byteVal dataType)
//        byteVal = (byte)(byteVal + 15); // we need to typecast it manually...
//        System.out.println(byteVal);

//        int x3 = 10;
//        ++x3 ;--x3; // pre increment operator
//        x3++ ;x3--; // post increment operator
//        System.out.println(x3);

        int x4 = 10;
        System.out.println(++x4 + x4); // 11+11
//        int y4 = x4++ + x4; // y4 = 10 + 11;
//        System.out.println(y4);

    }
}
