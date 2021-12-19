package main.java.calc;

public class Calculator {

    public static int add(String nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(nums);
    }

}