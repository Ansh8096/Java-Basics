package com.engineerAnsh.java_1;

public class arrays {
    public static void main(String[] args)
    {
        // Syntax for array: type[] variableName;
//        int[] arr = new int[10];
//        arr[3] = 22;
//        arr[5] = 44;
//        for (int i = 0;i < arr.length;i++){  // we can't use 'length()' because it is not a method , it is a property...
//            System.out.println(arr[i]);
//        }

//        int[] arr1 = {1,2,3,4,5,}; // we can also directly declare values in the array like this...
//        // for each loop only for arrays...
//        for(int i:arr1){
//            System.out.println(i);
//        }

        // 2-D array :-

//        int[][]arr = new int[3][3]; // 1st method to declare a 2-D array..
//        int [][] arr1 = {    // 2nd method to declare a 2-D array..
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int i = 0;i<arr1.length;i++){
//            for (int j = 0;j< arr1.length;j++){
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println(); // printing the empty line
//        }

        // jagged 2-D array:
//        char arr[][] = new char[3][2];
        char arr[][] = new char[3][]; // we can also declare it like this
        arr [0] = new char [2];
        arr [1] = new char [3];
        arr [2] = new char [2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[1][2] = 'x';
        arr[2][0] = 'e';
        arr[2][1] = 'f';

        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // printing the empty line
        }
    }
}
