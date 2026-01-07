package revisionEngineerAnsh;

import java.util.*;

public class rvUpto15Lec {
    public static void main(String... args){
        // int and long..........
        int age1 = 233;
        long age2 = 12222222222223334l;
//        System.out.println(age2);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);

        // double and float...

        float val1 = 122.212f;
        double val2 = 12121;

//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);


        // characters....
        char initial = 'z';
//        System.out.println((int) initial);
//        System.out.println(initial);
//        System.out.println((char) 10084);

        char heart = 10084;
//        System.out.println(heart);
        char hindiSymbol = 2309;
//        System.out.println(hindiSymbol);

        char heartSymbol =  '\u2764';
//        System.out.println(heartSymbol);
        char rightSymbol =  '\u27A4';
//        System.out.println(rightSymbol);


//        for (char i = 0;i<= 10;i++){
//            System.out.print(i + " ");
//        }

        // widening (or implicit or automatic) conversion....
        long long_val = 10000000000l;// 8 byte
        float float_val = long_val;// 4 byte -- it can represent long (of 8 bytes) becauz float can represent numbers in scientific notations..
        double double_val = float_val;// 8 byte

//        System.out.println("long: " + long_val);
//        System.out.println("float: " + float_val);
//        System.out.println("double: " + double_val);



// Bitwise Operators:------->

//         OR operator...
//        int c = 5 | 4;
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(c); System.out.println(Integer.toBinaryString(c));

        // left shift operator...
//        int x = 5;
//        int x2 = x<<2;
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toBinaryString(x2));

        // right shift operator...
        int y = -5;
        int y2 = y>>2;
//        System.out.println(Integer.toBinaryString(y));
//        System.out.println(Integer.toBinaryString(y2));

        // unsignedRight shift operator...
        int z = -5;
        int z2 = z>>>2;
//        System.out.println(Integer.toBinaryString(z));
//        System.out.println(Integer.toBinaryString(z2));


// Conditional statements:---->

//        boolean first = 2<3;
//        System.out.println(first);
//
//        String str = "apple";
//        switch (str)
//        {
//            case "apple":
//                System.out.println("this is an apple...");
//                break;
//
//                case "banana":
//                System.out.println("this is an banana...");
//                break;
//
//                case "mango":
//                System.out.println("this is an mango...");
//                break;
//
//                default:
//                System.out.println("this is an invalid fruit...");
//
//        }

//  ARRAYS :----------->
        int[] arr = {1,2,3,4,5};
//        arr[0] = 2;
//        arr[1] = 2;
//        arr[2] = 2;
//        arr[3] = 2;
//        arr[4] = 2;

//        System.out.println(arr[0]);


//  Methods in JAVA:--------->
        int a[] = {10,20,30,40,50};

//        System.out.println(sumOfTheNumbers(a));
//        System.out.println(sumOfTheNumbers(1,2,3,4));

//        System.out.println(sumOfFirstN(5));


//        char[] arr5 = new char[4];
//        Arrays.fill(arr5, '.');
//        String str5 = new String(arr5);
//        System.out.println(str5);
//        List<String> temp = new ArrayList<>();
//        for (int i = 0;i<4;i++){
//            temp.add(new String(str5));
//        }

    }

//  Methods in JAVA:--------->
    public static int sumOfTheNumbers(int ...a){
        int sum = 0;
        for (int itr : a){
           sum += itr;
        }
        return sum;
    }

// RECURSION:------------------>
    private static int sumOfFirstN(int n){
        if(n <= 0) return 0;
        return n + sumOfFirstN(n-1);
    }

}
