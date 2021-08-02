import java.util.ArrayList;

public class Basics {
    public int printAll(){
        for (int i=0; i<255; i++) {
            System.out.println(i);
        }
        return 255;
    }
    public int printOdds(){
        int i = 1;
        while (i<254) {
            System.out.println(i);
            i += 2;
        }
        return 255;
    }
    public int sigmaOf255(){
        int i = 0;
        int sum = 0;
        while (i<256) {
            sum += i;
            i++;
        }
        return sum;
    }
    public int iterateThroughArray(int[] array) {
        for(int item : array){
            System.out.println(item);
        }
        return 0;
    }
    public int findMax(int[] array) {
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i]>max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }
    public ArrayList<Integer> oddsList() {
        ArrayList<Integer> dyArray = new ArrayList<Integer>();
        int i = 1;
        while (i<256){
            dyArray.add(i);
            i += 2;
        }
        return dyArray;
    }
    public int getAvg(int[] array) {
        int len = array.length;
        int sum = 0;
        int i = 0;
        while (i<len) {
            sum += array[i];
            i++;
        }
        int avg = sum/len;
        return avg;
    }
    public int greaterThanY(int[] array, int y) {
        int count = 0;
        for(int item : array) {
            if (item > y) {
                count += 1;
            }
        }
        return count;
    }
    public int[] squared(int[] array) {
        for (int i=0;i<array.length; i++) {
            array[i] = array[i]*array[i];
            System.out.println(array[i]);
        }
        return array;
    }
    public int[] removeNeg(int[] array) {
        for (int i=0; i<array.length; i++){
            if (array[i]< 0) {
                array[i] = 0;
            }
        }
        return array;
    }
    public int[] maxMinAvg(int[] array) {
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            sum += array[i];
            if (array[i]> max) {
                max = array[i];
            }
            if (array[i]< min) {
                min = array[i];
            }
        }
        int avg = sum/array.length;
        int[] result = {max,min,avg};
        return result;
    }
    public int[] shiftLeft(int[] array) {
        int temp = array[0];
        for (int i=0; i<array.length; i++){
            if (i == array.length-1) {
                array[i]=temp;
            } else {
                array[i]=array[i+1];
            }
        }
        return array;
    }
}