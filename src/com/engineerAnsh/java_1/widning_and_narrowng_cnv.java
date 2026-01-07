package com.engineerAnsh.java_1;

class widning_and_narrowng_cnv{
    public static void main(String[] args){

        // widening (or implicit or automatic) conversion....
//        byte byte_val = 10; // 1 byte
//        short short_val = byte_val;// 2 byte
//        int int_val = short_val;// 4 byte
//        long long_val = int_val;// 8 byte
//        float float_val = long_val;// 4 byte -- it can represent long (of 8 bytes) becauz float can represent numbers in scientific notations..
//        double double_val = float_val;// 8 byte
//
//        System.out.println("byte: " + byte_val);
//        System.out.println("Short: " + short_val);
//        System.out.println("int: " + int_val);
//        System.out.println("long: " + long_val);
//        System.out.println("float: " + float_val);
//        System.out.println("double: " + double_val);

        // widening conversion of char into integer and float datatypes...
//        char char_val1 = 'z';
//        int int_val1 = char_val1; // it will store the corresponded value of particular character...
//        float float_val1 = char_val1;// it can also store the corresponded value of particular character...
//        System.out.println(char_val1);
//        System.out.println("int : " + int_val1);
//        System.out.println("float : " + float_val1);

        // Narrowing conversions :- means we need to typecast which will cause some loss of value..

        double double_val = 123.456;
        float float_val = (float) double_val; // narrowing conversion from double to float
        long long_val = (long)float_val;      // narrowing conversion from float to long
        int int_val = (int)long_val;          // narrowing conversion from long to int

        System.out.println("double: " + double_val);
        System.out.println("float: " + float_val);
        System.out.println("long: " + long_val);
        System.out.println("int: " + int_val);

        long a = Long.MAX_VALUE; // 0111111111111111111111111111111111111111111111111111111111111111 :- binary representation...
        int b = (int)a; // 11111111111111111111111111111111 :- binary representation...
        System.out.println(a);
        System.out.println(b); // this will print -1 becauz in binary it has 1 in the starting of its binary number ...

        // this is how we can print the binary of any number in integer,long,etc ...
        System.out.println(Integer.toBinaryString(2322));  // Here: INTEGER is a class
        System.out.println(Long.toBinaryString(Long.MAX_VALUE)); // Here: LONG is a class
        System.out.println(Integer.toBinaryString(-1));

    }
}
