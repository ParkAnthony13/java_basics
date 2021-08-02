import java.util.ArrayList;
public class TestBasics {
    public static void main(String[] args) {
        // importing methods from Basics.java
        Basics basicMethods = new Basics();
        // first method printAll from 1-255
        System.out.println("Print All");
        int testPrintAll = basicMethods.printAll();
        System.out.println(testPrintAll);
        // second method print all odds from 1-255
        System.out.println("Print Odds");
        int testPrintOdds = basicMethods.printOdds();
        System.out.println(testPrintOdds);
        // third method, print the number representing sum of each number 1-255
        System.out.println("Print Sum");
        int testSigmaOf255 = basicMethods.sigmaOf255();
        System.out.println(testSigmaOf255);
        // create a list, put into list method to print each value of the list
        System.out.println("Print Each Value of Array");
        int[] list = {1,3,5,7,9,13};
        int testIterateThroughArray = basicMethods.iterateThroughArray(list);
        System.out.println(testIterateThroughArray);
        // method to return max value TWO exampels
        System.out.println("Find Max");
        int[] testMax1 = {-3,-5,-7};
        int[] testMax2 = {10,8,5,9};
        int testFindMax = basicMethods.findMax(testMax1);
        System.out.println(testFindMax);
        int testFindMax2 = basicMethods.findMax(testMax2);
        System.out.println(testFindMax2);
        // method that creates variable length list containing all odds from 1-256
        System.out.println("Return a list of all odds from 1-255");
        ArrayList<Integer> testOddsList = basicMethods.oddsList();
        System.out.println(testOddsList);
        // method that gives average, need to get length, sum, return divide
        System.out.println("Get Average");
        int[] listAvg = {2,3,10};
        int testGetAvg = basicMethods.getAvg(listAvg);
        System.out.println(testGetAvg);
        // returns count of elements greater than Y in inputArray
        System.out.println("Print Number of Elements greater than Y");
        int[] listY = {1,3,5,7};
        int y = 3;
        int testGreaterThanY = basicMethods.greaterThanY(listY,y);
        System.out.println(testGreaterThanY);
        // method that returns each element value squared
        System.out.println("Prints all Values Squared");
        int[] listSq = {1,5,10,-2};
        int[] squaredList = basicMethods.squared(listSq);
        System.out.println(java.util.Arrays.toString(squaredList));
        // Replace neg numbers with 0 in  a list
        System.out.println("Replace negative nums in list with 0");
        int[] modList = {1,5,10,-2};
        int[] moddedList = basicMethods.removeNeg(modList);
        System.out.println(java.util.Arrays.toString(moddedList));
        // Find Max, Min, Avg of Array (sum/length)
        System.out.println("Find and return Max Min and Avg of Array in an Array");
        int[] testList = {1,5,10,-2};
        int[] aboutList = basicMethods.maxMinAvg(testList);
        System.out.println(java.util.Arrays.toString(aboutList));
        // shift the array to the left so that the first value goes to the end
        System.out.println("Shift Values to left, First value becomes last");
        int[] shiftList = {1,5,10,7,-2};
        int[] shiftedList = basicMethods.shiftLeft(shiftList);
        System.out.println(java.util.Arrays.toString(shiftedList));
    }
}