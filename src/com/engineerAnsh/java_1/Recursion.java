package com.engineerAnsh.java_1;

public class Recursion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));

        int n2 = 5;
        System.out.println(sumOfFirstN2(5));
    }

    // 5+4+3+2+1
    private static int factorial(int n){
        if(n==1) return 1;   // base case:
        return n*factorial(n-1);
    }

    private static int sumOfFirstN(int i, int n){
        if(i > n) return 0;
        return i + sumOfFirstN(i+1,n);
    }
    private static int sumOfFirstN2(int n){
        if(n <= 1) return 1;
        return n+sumOfFirstN2(n-1);
    }
}
