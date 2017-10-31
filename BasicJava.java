import java.util.ArrayList;

public class BasicJava{
    // 1 print 1-255
    public void printAll(int num1, int num2){
        for (int i = num1; i < num2; i++){
            System.out.println(i); 
        }
    }
    // 2 print odd nums 1-255
    public void printAllOdds(int num1, int num2){
        for (int i = num1; i < num2; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }    
        }
    }
    // 3 print sum of nums 1-255 (include each num and current sum)
    public void printSum(int num1, int num2){
        int sum = 0;
        for (int i = num1; i < num2; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum); 
        }
    }
    // 4 iterate through array and print values
    public void printArrVals(int[] thisArray){
        for (int item : thisArray) {
            System.out.println(item);
        }
    }
    // 5 find max value in array
    public int findArrMax(int[] thisArray){
        int max = thisArray[0];
        for (int item : thisArray) {
            if(item > max){
                max = item;
            }
        }
        return max;
    }
    // 6 print average of values in an array
    public int getArrAvg(int[] thisArray){
        int newSum = 0;
        for (int item : thisArray) {
            newSum += item;
            System.out.println("Number:" + item + " Current sum: " + newSum);
        }
        System.out.println("Divided by: " + thisArray.length);
        int average = newSum / thisArray.length;
        System.out.println("Average: " + average);
        return average;
    }
    // 7 create an array of odd nums from 1-255
    public ArrayList arrOdds(int num1, int num2){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = num1; i < num2; i++){
            if(i % 2 == 1){
                myArray.add(i);
            }    
        }
        return myArray;
    }
    // 8 return number of values in an array that are greater than y 
    public int findGreaterThanY(int[] thisArray, int y){
        int ySum = 0;
        for (int item : thisArray) {
            if(item > y){
                ySum += 1;
            }
        }
        return ySum;
    }
    // 9 square each value in an array
    public ArrayList arrSquared(int[] thisArray){
        int squareVal = 0;
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        for (int item : thisArray) {
            squareVal = item * item;
            myArray2.add(squareVal);
        }
        return myArray2;
    }
    // 10 replace negative nums in an array with 0
    public ArrayList noNegatives(int[] someArray){
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        int zero = 0;
        for (int item : someArray) {
            if(item < 0){
                myArray3.add(zero);
            }
            else{
                myArray3.add(item);
            }
        }
        return myArray3;
    }
    // 11 return a new array with the min value, max value, and the average of all values in original array
    public ArrayList minMaxAvg(int[] anotherArray){
        ArrayList<Integer> myArray4 = new ArrayList<Integer>();
        int minNum = anotherArray[0];
        int maxNum = anotherArray[0];
        int sum11 = 0;
        for (int item : anotherArray) {
            if(item > maxNum){
                maxNum = item;
            }
            if(item < minNum){
                minNum = item;
            }
            sum11 += item;
        }
        int avg = sum11 / anotherArray.length;
        myArray4.add(minNum);
        myArray4.add(maxNum);
        myArray4.add(avg);
        return myArray4;
    }
    // 12 shift values in an array forward (to the left) by one place; last index should have a value of 0
    
    // Incomplete! Still debugging this method... 
    public int[] shiftArray(int[] lastArray){
        int temp = 0;
        for (int i =0; i < lastArray.length - 1; i++) {
            temp = lastArray[i];
            // System.out.println(temp);
            lastArray[i] = lastArray[i + 1];
            System.out.println(lastArray[i]);
            // if(lastArray[i-= 1] !< 0){
            //     lastArray[i -= 1] = temp;
            // }
        
        }
        // int lastIdx = lastArray.length -= 1;
        // lastArray[lastIdx] = 0;
        System.out.println(lastArray);
        return lastArray;
    }
} 
    
