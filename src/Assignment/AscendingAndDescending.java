package Assignment;

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int entry1;
        int entry2;
        int entry3;
        String result = null;
        String result1 = null;

        System.out.println("Enter a number >>>");
        entry1 = input.nextInt();

        System.out.println("Enter a second number >>>");
        entry2 = input.nextInt();

        System.out.println("Enter a third number >>>");
        entry3 = input.nextInt();

        if (entry1 > entry2 && entry1 > entry3){
            if (entry2 > entry3){
                result = "Ascending Order " + entry1 + " , " + entry2 + " , " + entry3;
                result1 = "Descending Order " + entry3 + " , " + entry2 + " , " + entry1;
            }
            else {
                result = "Ascending Order " + entry1 + " , " + entry3 + " , " + entry2;
                result1 = "Descending Order " + entry3 + " , " + entry2 + " , " + entry1;
            }
        }
        else if (entry2 > entry1 && entry2 > entry3){
            if (entry1 > entry3){
                result = "Ascending Order " + entry2 + " , " + entry1 + " , " + entry3;
                result1 = "Descending Order " + entry3 + " , " + entry1 + " , " + entry2;
            }
            else {
                result = "Ascending Order " + entry2 + " , " + entry3 + " , " + entry1;
                result1 = "Descending Order " + entry1 + " , " + entry3 + " , " + entry2;
            }
        }
        else if (entry3 > entry1 && entry3 > entry2){
            if (entry1 > entry2){
                result = "Ascending Order " + entry3 + " , " + entry1 + " , " + entry2;
                result1 = "Descending Order " + entry2 + " , " + entry1 + " , " + entry3;
            }
            else {
                result = "Ascending Order " + entry3 + " , " + entry2 + " , " + entry1;
                result1 = "Descending Order " + entry1 + " , " + entry2 + " , " + entry3;
            }
        }
        System.out.println(result + "\n" + result1);
    }
}
