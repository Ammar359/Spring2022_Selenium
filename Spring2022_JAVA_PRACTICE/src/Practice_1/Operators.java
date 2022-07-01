package Practice_1;

public class Operators {
    /**
     * OPERATORS
     * Assignment ( = )
     * Arithmetic ( + , -, *, /, %, ++, -- )
     * Comparison ( <, < , <=, =>, ==, != )
     * Logical ( &&, ||, ! )
     * Ternary ( ?: )
     * Advanced Assignment Operator ( +=, -=, *=, %=, )
     * 
     */

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;
        int num3 = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + num3);

        int i = 10;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);

        ++i;
        System.out.println("i = " + ++i);


        /**
         * Comparison Operator: Result of every comparison operator is boolean
         */
        int com1 = 5;
        int com2 = 7;
        boolean com1Grcom2 = com1 > com2;

        System.out.println(com1 + ">" + com2+ "=" +com1Grcom2);

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         */

        int num =+ 5;

        System.out.println(num);

        /**
         * Logical (&&, ||, !)
         * && -> and operator
         * || -> or operator
         * ! -> not operator
         */
        /**
         * We use logical operators to join two or more conditions.
         * Final result will always be boolean
         *
         * && operator (and operator)
         *  all combined conditions must be true to get final result as true
         *  if any one of the conditions is false, final result is false.
         *
         * || operator (or operator)
         *  any one of the combined conditions has to be true to get final result as true
         *  if all combined conditions are false, then final result is false.
         *
         * ! operator (not operator)
         *  not operator will make true as false and vice versa
         *
         */

        /**
         * Ternary (?:)
         *
         *  used in situation where you want to assign value to a variable depending on condition(s)
         *
         * mortgageRate = 1.5/2.5 [creditScore>700 / otherwise]
         *
         * mortgageRate = 1.5/2.5 [creditScore>700 or first-time-buyer / otherwise]
         *
         * mortgageRate = 1.0/2.5 [creditScore>700 and first-time-buyer and veteran / otherwise]
         *
         * Not Valid scenario:
         * mortgageRate = 1.0/1.5/2.5 [creditScore>700 and first-time-buyer and veteran / creditScore>700 and first-time-buyer / otherwise]
         *
         * Syntax:
         *
         * variable = condition(s) ? valueIfTrue : valueIfFalse
         *
         *
         * eg:  mortgageRate = 1.5/2.5 [creditScore>700 / otherwise]
         *
         * int creditScore = 770;
         * mortgageRate = creditScore > 700 ? 1.5 : 2.5;
         * sout(mortgageRate)
         */

    }
}
