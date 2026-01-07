package com.engineerAnsh.java_1;

class java_test
{
    public static void main(String[] args)
    {
        // Printing hello world...
        System.out.println("hii world!!");

        // PRIMITIVE DATA TYPES :-
        // 1. Integer numbers -
//        byte age = 21;
//        short age1 = 22;
//        int age2 = 233;
//        long age3 = 9223372036854775807l; // if the no is greater then the int data type then we need to put l in last to identify the it is of long data type
//        System.out.println(age3);
//        System.out.println(Long.MIN_VALUE); // tells the min. value long data type can hold..
//        System.out.println(Long.MAX_VALUE); // tells the max. value long data type can hold..

        // 2. DECIMAL NUMBERS:-(float,decimal)
//        float my_salary = 1000.123456789f; // at last we need to put f becauz by default it is double...
//        double your_salary = 1000.123456789;
//        System.out.println(my_salary); // it will only print upto certain decimals approx. upto 7 precision points...
//        System.out.println(your_salary); // it will only print upto certain decimals approx, upto  15 precision points...
//
//        System.out.println("the minimum value of float :" + Float.MIN_VALUE); // it will tell us the min. value closest to zero which it can hold...
//        System.out.println("the maximum value of float :" + Float.MAX_VALUE); // it will give the highest value it can hold in +ve (but you can find out in  -ve if u change the sign)
//
//        System.out.println("the maximum value of double :" + Double.MIN_VALUE);// it will tell us the min. value closest to zero which it can hold...
//        System.out.println("the minimum value of double :" + Double.MAX_VALUE);// it will give the highest value it can hold in +ve (but you can find out in -ve if u change the sign)

        // 3. characters :-
//          char initial = 'z';
//          System.out.println(initial); // this will print the char as it is ...
//          System.out.println((int)initial); // this will print the integer value corresponding to the particular char ...

//          System.out.println((int)Character.MIN_VALUE); // this will print the smallest integer value of the char it acn hold...
//          System.out.println((int)Character.MAX_VALUE); // this will print the largest integer value of the char it acn hold...
//          System.out.println((char) 10084); // this will print the char value of that particular integer value...

        // we can store characters like this also...
//          char heart_symbol = 10084;
//          System.out.println(heart_symbol);
//          char hindi_char = 2309;
//          System.out.println(hindi_char);

        // We can store characters like this also..
//          char heart = '\u2764'; //  '/u' -> means unicode representation....
//          System.out.println(heart); // it will print the char corresponding to that integer value...

        // A is the representation in HEXADECIMAL NUMBERS...
//          char right_arrow = '\u27A4';
//          System.out.println(right_arrow);
          
        // printing all the ASCII values (which are from 0 to 127) each value represents the different chars..
        for (int i = 0;i<128;i++){
            System.out.println((char)(i));
        }
    }
}
