package rvt.practise_arrays_classes;

public class SumOfArray {
    public static void program(String[] args){
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
        
    }
    public static void sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of numbers in an array is: " + sum);
    }
}
