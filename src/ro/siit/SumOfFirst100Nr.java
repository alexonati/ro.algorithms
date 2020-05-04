package ro.siit;

public class SumOfFirst100Nr {

    // 1. sum of 1st 100 nr > 0
    public static void main(String[] args) {
        int sum_of_numbers;
        sum_of_numbers = 0;
        int max_number;
        max_number = 101;
        for(int i = 1; i < max_number; ++i)
            sum_of_numbers += i;
        System.out.println("1. sum of 1st 100 nr > 0");
        System.out.println("Sum = " + sum_of_numbers);


    }
}

