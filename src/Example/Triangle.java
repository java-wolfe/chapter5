package Example;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for \n 1 - for right triangle /\n "+
        " 2 -for Isosceles \n 3- for Equilateral \nChoice>>>>>");
        choice = input.nextInt();

        if(choice == 1){
            rightTriangle();
        }
        else if(choice == 2){
            solvePerimeter();
        }
        else if(choice == 3){
            solveArea();
        }
    }
    public static void rightTriangle(){

    }
    public static void solvePerimeter(){

    }
    public static void solveArea(){

    }
}