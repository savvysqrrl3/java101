import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        
        // BasicJava range = new BasicJava();
        // range.printAll(1, 256);
        // 2) BasicJava range2 = new BasicJava();
        // range2.printAllOdds(1, 256);
        // 3)BasicJava range3 = new BasicJava();
        // range3.printSum(1, 256);
        // 4) BasicJava range4 = new BasicJava();
        // int[] arr1 = {8, 6, 7, 5, 6, 4, 5, 3, 4, 2, 3, 1, 2, 7, 1};
        // range4.printArrVals(arr1);
        // 5) BasicJava range5 = new BasicJava();
        // int[] arr1 = {-5, 0, 10, -15, 20, -25};
        // int maxNum = range5.findArrMax(arr1);
        // System.out.println(maxNum); 
        // 6) BasicJava range6 = new BasicJava();
        // int[] arr1 = {2, 4, 6, 8, 20, -10};
        // int avg = range6.getArrAvg(arr1);
        // System.out.println(avg);
        // 7) BasicJava range7 = new BasicJava();
        // ArrayList oddArr = range7.arrOdds(1, 25);
        // System.out.println(oddArr);
        // 8) BasicJava range8 = new BasicJava();
        // int[] arr1 = {5, 10, 20 ,30 ,40, 50};
        // int y = 10;
        // int yNum = range8.findGreaterThanY(arr1, y);
        // System.out.println(yNum);
        // 9) BasicJava range9 = new BasicJava();
        // int[] someList = {5, 10, -5, -10};
        // ArrayList sqrdArr = range9.arrSquared(someList);
        // System.out.println(sqrdArr);
        // 10) BasicJava range10 = new BasicJava();
        // int[] someList2 = {1, 5, -6, 10, -2};
        // ArrayList noNegArr = range10.noNegatives(someList2);
        // System.out.println(noNegArr);
        // 11) BasicJava range11 = new BasicJava();
        // int[] yetAnotherArray = {-20, -15, -10, -5, 0, 5, 10};
        // ArrayList minMaxAvg = range11.minMaxAvg(yetAnotherArray);
        // System.out.println(minMaxAvg);
        // 12)
        BasicJava range12 = new BasicJava();
        int[] arr12 = {1, 3, 5, 7, 9};
        int[] shifted = range12.shiftArray(arr12);
        System.out.println(shifted);
    }
}