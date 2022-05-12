import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CodeTest2 {

    /**
     * Ques-2:
     * Verify feelsLike-temp value is in between the low-temp value and high-temp value
     * Web: https://www.darksky.net/
     * points: 20
     */

    @Test
    public void verifyTempSort() {

        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");

        MyDriver.getDriver().manage().window().maximize();

        String feelsLikeTemp = "//span[@class='feels-like-text']";
        By feelsLikeTempXpathLocByXpath = By.xpath(feelsLikeTemp);
        WebElement feelsLikeTempLocator = MyDriver.getDriver().findElement(feelsLikeTempXpathLocByXpath);

        String feelsLikeDisplayedF = feelsLikeTempLocator.getText();
        String feelsLikeDisplayedFRemoved = feelsLikeDisplayedF.substring(0, feelsLikeDisplayedF.length() - 1);
        double feelsLikeTempValue = Integer.parseInt(feelsLikeDisplayedFRemoved);

        String lowTemp = "//span[@class='low-temp-text']";
        By lowTempXpathLocByXpath = By.xpath(lowTemp);
        WebElement lowTempLocator = MyDriver.getDriver().findElement(lowTempXpathLocByXpath);

        String lowTempDisplayedF = lowTempLocator.getText();
        String lowTempDisplayedFDegRemoved = lowTempDisplayedF.substring(0, lowTempDisplayedF.length() - 1);
        double lowTemValue = Integer.parseInt(lowTempDisplayedFDegRemoved);

        String highTemp = "//span[@class='high-temp-text']";
        By highTempXpathLocByXpath = By.xpath(highTemp);
        WebElement highTempLocator = MyDriver.getDriver().findElement(highTempXpathLocByXpath);

        String highTempDisplayedF = highTempLocator.getText();
        String highTempDisplayedFDegRemoved = highTempDisplayedF.substring(0, highTempDisplayedF.length() - 1);
        double highTempValue = Integer.parseInt(highTempDisplayedFDegRemoved);


        System.out.println(feelsLikeTempValue + "\n" + lowTemValue + "\n" + highTempValue);

        if (feelsLikeTempValue >= lowTemValue)
            System.out.println("Feels like Temperature is higher or equal than low Temperature");
        else
            System.out.println("Feels like Temperature is not higher or equal than low Temperature");

        if (feelsLikeTempValue <= highTempValue)
            System.out.println("Feels like Temperature is lower or equal than high Temperature");
        else
            System.out.println("Feels like Temperature is not lower or equal than high Temperature");

        MyDriver.quitWindows();

    }

    /**
     * Ques-1:
     * Create a method to return factorial value of input-int-value
     * points: 10
     */
    /*
     *
     * eg:
     * input -> 5
     * returned value -> (5*4*3*2*1) = 120
     *
     * input -> 1
     * returned value -> (1) = 1
     *
     * input -> 3
     * returned value -> (3*2*1) = 6
     *
     * input -> 10
     * returned value -> (10*9*8*7*6*5*4*3*2*1) =
     */
    //ANSWER
    @Test
    public void factorialValue5() {
        int num = 5;
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the 5 ---> " + fact);
    }

    @Test
    public void factorialValue1() {

        int num = 1;
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the 1 ---> " + fact);

    }

    @Test
    public void factorialValue3() {

        int num = 3;
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the 3 ---> " + fact);

    }

    @Test
    public void factorialValue10() {
        int num = 10;
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the 10 ---> " + fact);
    }


    /**
     * Ques-3:
     * Create a method to return the common Strings values in two input-String-arrays
     * points: 30
     */

        //Method For the Question 3

    public static void commonValues(String[] inputA , String[] inputB ){

        boolean commonValuesPresent = false;
        ArrayList<String> commonValues = new ArrayList<>();

        for (String valA : inputA){
            for (String valB : inputB) {
                if (valA.equalsIgnoreCase(valB)) {
                    commonValues.add(valB);
                    commonValuesPresent = true;
                }
            }
        }
        if (!commonValuesPresent){
            System.out.println("There are no common values");
        } else {
            System.out.println("\nCommon Values --> " + commonValues);


        }
    }

    /**
     * ANOTHER METHOD TO SOLVE ABOVE QUESTION
     *       String[] array1 = {"happy", "king", "peace", "living standard"};
     *             String[] array2 = {"king kong", "happy", "PEACE"};
     *
     *             System.out.println("Array1 : " + Arrays.toString(array1));
     *             System.out.println("Array2 : " + Arrays.toString(array2));
     *
     *             HashSet<String> set = new HashSet<String>();
     *
     *             for (int i = 0; i < array1.length; i++) {
     *                 for (int j = 0; j < array2.length; j++) {
     *                     if (array1[i].equals(array2[j])) {
     *                         set.add(array1[i]);
     *                     }
     *                 }
     *             }
     *             // return common elements.
     *             System.out.println("Common elements ---> " + (set));
     *         }
     */

    /**
     * Ques-4:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * points: 40
     */

    // Method For the Question 4

    public static int missingSmallestPositiveInteger(int[] input) {

        for(int i = 0 ; i < input.length ; i++){ //  input -> Ascending order and find missmin
            int minimumIndex = i ;

            for (int j = i+1 ; j < input.length ; j++){
                if(input[minimumIndex] > input[j])
                    minimumIndex = j ;
            }
            int val = input[i];
            input[i] =input[minimumIndex];
            input[minimumIndex] = val;
        }

        int smallestMissingValue = 1;
        for(int i = 0 ; i < input.length ; i++){
            if(input[i] == smallestMissingValue)
                smallestMissingValue++;
            else if (input[i] > smallestMissingValue)
                break;;
        }
        return smallestMissingValue;
    }

    public static void main(String[] args) {


        //Question 3

        String[] inputA = {"happY", "king", "peace", "living standard"};
        String[] inputB = {"king kong", "Happy", "PEACE"};

        commonValues(inputA,inputB);


        //Question 4

        int[] input = {3, 5, 1, 4, 2, 7};

        int missingPosInt = missingSmallestPositiveInteger(input);

        System.out.println("\nMissing Smallest Positive Integer is " + missingPosInt);

        int[] input1 = {2, 5, -1, 0, 6};

        int missingPosInt1 = missingSmallestPositiveInteger(input);

        System.out.println("\nMissing Smallest Positive Integer is " + missingPosInt1);



    }





}
