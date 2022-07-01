package Practice_1;

public class DataTypes {
    /**
     * There are two types of DATA TYPES in java
     * 1. Primitive data type which include  byte, short,int, float, double, char and boolean
     *   * int myNum = 5;               // Integer (whole number)
     *      * float myFloatNum = 5.99f;    // Floating point number
     *      * char myLetter = 'D';         // Character
     *      * boolean myBool = true;       // Boolean
     *      * String myText = "Hello";     // String
     *
     * 2. NON-Primitive data types, which are added by users in java. they Include String and Array
     * String is non primitive data type and can store single or multiple characters.
     * value must be enclosed inside DOUBLE QUOTES. String is a CLASS
     *
     * String myName = "Ammar Ashraf";
     *
     */

    public static void main(String[] args) {
        String nyName = "Ammar Ashraf";
        System.out.println("My name is " + nyName);

    }

    /**
     * VARIABLES::
     * we need variables to store the value. it is like containers for values
     * Syntax to create the variables.
     * datatype varName;        OR
     * datatype varName = val;
     *
     */

    /**
     * Good practices to provide names:
     * 1. Variables:
     *      -> name cannot have spaces
     *      -> name should relate with the stored value
     *      -> name should always start with lowercase
     *      -> never start with digit or special character
     *      -> if name having more than 1 word, follow camelCaseFormat
     *      eg:
     *      family member -> familymember -> familyMember
     *      number of my cars -> numberofmycars -> numberOfMyCars
     *
     * 2. Class:
     *      -> name cannot have spaces
     *      -> name should relate to the code inside Java class
     *      -> name should always start with Uppercase
     *      -> never start with digit or special character
     *      -> if name having more than 1 word, follow CamelCaseFormat
     *
     * 3. Package:
     *      -> name cannot have spaces
     *      -> name should relate to the Java files inside the package
     *      -> name should always start with Uppercase
     *      -> never start with digit or special character
     *      -> if name having more than 1 word, follow CamelCaseFormat
     */

    /**
     * All java variables must be identified with unique name and these unique names are called IDENTIFIERS
     *
     */

    // Good practice
    int minutesPerHour = 60;

    //okay practice

    int m = 60;

}
