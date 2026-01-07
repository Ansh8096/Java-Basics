package com.engineerAnsh.java_1;

public class variableNames {
public static void main(String[] args){

    // case sensitive :
    // variables can be letter, dollarSigns ($),underscore (_)
    // variables can't begin with the letters.
    // can't use java keywords (such as: public,class,static etc) as variables names.
    // we should use camel case in java and snake case in python..

//    String public = "Ansh Verma"; // it will not work since we use the java keyword as our variable name here...
    String myFullName = "Ansh Verma"; // camel case...
    String my_company_name = "Google"; // Snake case...
    System.out.println(myFullName);
    System.out.println(my_company_name);

    int _salary1 = 1111111;
    System.out.println(_salary1);
//    int 1Salary = 1111111; // it will not work since our variable name starts from a letter..
    int $salary1 = 1111111;
    System.out.println($salary1);
    }
}
