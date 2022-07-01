package Practice_2;

public class String {

    // String_Concept_1 -> length(), toLowercase(), toUppercase(), equals(), equalsIgnoreCase(), contains()
    // String_Concept_2 -> replace(), charAt(), indexOf(), lastIndexOf(), startsWith(), endsWith(), trim(), subString()
    // Methods discussed here -> split()

    /**
     * String is a class, non primitive data type and can store sinlge or multiple characters
     *
     * it must be inside DOUBLE QUOTES.
     */

    public static void main(String[] args) {
     java.lang.String name = "Ammar";
        /**
         * start index = 0
         * length = 5
         * last index = 4
         */


        java.lang.String statement = "new York times";
        System.out.println("statement -> " + statement);
        /**
         * start index = 0
         * length = 14
         * last index = 13
         *
         *
         * last Index = length - 1
         * index-value is ALWAYS int
         * lastIndex can NEVER be equal or greater than to length
         *
         */

        // Methods discussed here -> length(), toLowercase(), toUppercase(), equals(), equalsIgnoreCase(), contains()

        java.lang.String stmt = "";

        /**
         * To find the length of a string
         * method: length()
         * return type: int
         *
         */

        int statementLength = statement.length();
        System.out.println("\nLength of '" + statement + "' -> " + statementLength);

        System.out.println("Length of '" + name + "' -> " + name.length());

        int len = "abcd".length();
        System.out.println("len -> " + len);

        /**
         * To convert String-value into lowercase
         * method: toLowercase()
         * return type: String
         *
         * This method is not going to change the original value (or value in original variable)
         * It will convert the value in lowercase and return the result.
         *
         */
        /*
            Converting the value in lowercase, and storing result in NEW variable
         */
        java.lang.String statementToLowercase = statement.toLowerCase();    // new york times

        System.out.println("\nstatement -> " + statement);
        System.out.println("statementToLowercase -> " + statementToLowercase);

        /*
            Converting the value in lowercase, and storing result in ORIGINAL variable
         */
//        statement = statement.toLowerCase();
//        System.out.println("\nstatement -> " + statement);

        /**
         * To convert String-value into uppercase
         * method: toUppercase()
         * return type: String
         *
         * This method is not going to change the original value (or value in original variable)
         * It will convert the value in uppercase and return the result.
         *
         */
        java.lang.String statementToUppercase = statement.toUpperCase();

        System.out.println("\nstatement -> " + statement);
        System.out.println("statementToUppercase -> " + statementToUppercase);


        java.lang.String name1 = "Deepak";
        java.lang.String name2 = "deepak";

        // is name1 equal to name2

        boolean abc = name1 == name2;
        System.out.println("abc -> " + abc);
        /**
         * For comparison, when we need to verify if two String values are IDENTICAL.
         * method: equals()
         * return type: boolean
         *
         * If two String-values are identical, equals() method returns true
         * else false
         */
        boolean isEqual = statement.equals(statementToLowercase);
        System.out.println("\nis '" + statement + "' equal to '" + statementToLowercase + "' -> " + isEqual);

        /**
         * For comparison, when we need to verify if two String values are SAME (ignoring cases)
         * method: equalsIgnoreCase()
         * return type: boolean
         *
         * If two String-values are having same-value, equalsIgnoreCase() method returns true
         * else false
         */
        boolean isSameValue = statement.equalsIgnoreCase(statementToLowercase);
        System.out.println("\nis '" + statement + "' equal (ignoring cases) to '" + statementToLowercase + "' -> " + isSameValue);

        /**
         * To find if a particular sequence is EXACTLY present in the given String
         * method: contains()
         * input: String/sequence
         * return type: boolean
         *
         * "nEw YorK TimES"
         *
         * "new" -> false
         * "w Yor" -> true
         * "or" -> true
         * "E" -> true
         *
         *
         */
        statement = "nEw YorK TimES";

        boolean isContains_new = statement.contains("new");
        System.out.println("\nis contains 'new' in '" + statement + "' -> " + isContains_new);

        boolean isContains_w_Yor = statement.contains("w Yor");
        System.out.println("is contains 'w Yor' in '" + statement + "' -> " + isContains_w_Yor);

        boolean isContains_or = statement.contains("or");
        System.out.println("is contains 'or' in '" + statement + "' -> " + isContains_or);

        boolean isContains_E = statement.contains("E");
        System.out.println("is contains 'E' in '" + statement + "' -> " + isContains_E);

        /**
         * Task: verify if statement("nEw YorK TimES") contains "NeW"
         * Note: pls ignore the cases
         * Expected result: true
         *
         * ---> Pseudo coding <---
         * convert statement into uppercase -> "NEW YORK TIMES" (statement_U)
         * convert "NeW" into uppercase -> "NEW" (new_U)
         * apply contains method on statement_U with new_U
         *
         */
        java.lang.String statement1 = "jkhdjka s;jksadhksajd ajkhdaskjhdsjk hasjklh adjkslhdasljk";
        java.lang.String checkFor = "ZzzZ";

        java.lang.String statement1_lower = statement1.toLowerCase();     // new york times
        java.lang.String checkFor_lower = checkFor.toLowerCase();         // new

        boolean ans = statement1_lower.contains(checkFor_lower);
        System.out.println("ans -> " + ans);

    }

}
