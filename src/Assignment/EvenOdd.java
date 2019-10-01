package Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int numEntered;
        String result;
        System.out.println("Enter the number >>>");
        Scanner input = new Scanner(System.in);
        numEntered = input.nextInt();

        if(numEntered % 2 == 0)
            result = "Even";
        else
            result = "Odd";

        System.out.println(result);
    }
}
