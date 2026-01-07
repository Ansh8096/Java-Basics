package com.engineerAnsh.java_1;

public class conditionalStatment {
    public static void main(String[] args){

         // relational operators : (<,>,==,!=,=<,=>)

        // to check for multiple conditions at the same time we use :
        // 1. logical And(&&)
        // 2. logical OR(||)
        // 3. logical NOT(!)

//        int ramMarks = 35;
//        int ramAge  = 50;
//        System.out.println(ramMarks >= 33 && ramAge <= 18); // logical AND
//
//        String name = "Ansh";
//        boolean tier1 = true;
//        int exp = 2;
//        boolean cond1 = exp>=5;
//        System.out.println(tier1 || cond1); // logical OR
//        System.out.println( !(2<3) ); // logical NOT

        // CONDITIONAL STATEMENTS:--

        // 1. Else if Statements-->
//        int ramMarks = 35;
//        int ramAge  = 50;
//        if(ramMarks >= 33 && ramAge <= 20){
//            System.out.println("Congrats");
//        }
//        else System.out.println("Better Luck Next Time");

        // 2. Switch case:
        // it directly go to the true case and it didn't check for the rest of the conditions (that's why it is faster then if-else)
        // it needs break statement in each else it will print all the remaining cases...
        // it will not work in case of float,double datatypes.. (for that you have to use if-else statements only)

        // e.g = 1
        String str = "mango";
        switch (str)
        {
        case "apple" :
        System.out.println("It is an apple");
        break;

        case "banana" :
        System.out.println("It is an banan");
        break;

        case "grapes" :
        System.out.println("It is an grapes");
        break;

        case "mango":
        System.out.println("It is an mango");
        break;

        default:
            System.out.println("It is not a fruit");
        }

        // e.g = 2
        int number = 1;
        switch(number){
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1,2 or 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("number is not 2,3 or 4");
        }
    }
}
