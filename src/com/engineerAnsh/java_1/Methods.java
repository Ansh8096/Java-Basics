package com.engineerAnsh.java_1;

public class Methods {
//    public static void main(String[] args) {
    public static void main(String... args) { // we can write it like this also...
        System.out.println(args[0]);
        System.out.println(args[1]);

//        int[] a = {1,2,3,4,5};
//        System.out.println(sumArray(a));
//        int[] b = {10,20,30,40,50};
//        System.out.println(sumArray(b));

//        String s  = "   ansh verma ";
//        System.out.println(func1(s)); // it will print "ANSH VERMA" , beacuz we are sending the copy of the s...
//        System.out.println(s); // it will print "   ansh verma " only becuase our org. string is not changed ...

//        int x = 3,y = 2,z = 2;
        // this is known as method overloading...
//        System.out.println(sum(x,y));
//        System.out.println(sum(x,y,z));


//        int p = 10;
//        System.out.println(multiplyBy10(p)); // it will print 100 (10*10) , becauz we are sending the copy of p...
//        System.out.println(p); // it will print 10 only...

//        System.out.println( "sum is : " + sumMultipleVariables(  1,2,3,4));

//        int q = 11;
//        System.out.println(primeNo(q));


    }


// This are the methods...
    public static int sumArray(int[] arr){
        int res = 0;
        for(int it : arr){
            res += it;
        }
        return res;
    }

    // method to remove extra spaces and for uppercases...
    public static String func1(String str){
        return str.trim().toUpperCase();
    }

    // method overloading...
    private static int sum (int a , int b) {
        return a+b;
    }

//    @Override (static methods can't be annotated with notations)
    private static int sum (int a , int b,int c) {
        return a+b+c;
    }

    private static int multiplyBy10(int p){
        return p *10;
    }

    // this is the method to get the sum of multiple no's of variables...
    private static int sumMultipleVariables(int ...a){
        // after initializing a variable like this then you can treat it like an array...
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    // method to check if no is prime or not...
    private static boolean primeNo(int x){
        int cnt  = 0;
        for(int i =1 ; i <= x ; i++ ){
           if(x%i == 0) cnt++;
        }
        if(cnt == 2) return true;
        else return false;
    }

}
