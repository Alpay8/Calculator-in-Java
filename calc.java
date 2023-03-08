import java.util.Scanner; // import scanner utilities
public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char remainderSign = '%';
        System.out.print("Enter the first number: "); //get first number
        double number1 = scanner.nextDouble();  // store first number as number1
        scanner.nextLine();
        System.out.print("Enter the second number: "); //get second number
        double number2 = scanner.nextDouble(); // store second number as number2
        scanner.nextLine();
        System.out.println("What operation do you want to perform?\nPlease choose 
from: sum, difference, multiply, remainder, divide."); // prompt user for operation
        String operation = scanner.nextLine();
        switch(operation){  /*I used a switch operation because it is faster than 
an  if else statement*/
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + 
number2); // return sum
                break;
            case "difference":
                System.out.printf("%f - %f = %f", number1, number2, number1 - 
number2); //return difference
                break;
            case "multiply":
                System.out.printf("%f X %f = %f", number1, number2, number1 * 
number2); // return product
                break;
            case "remainder":
                System.out.printf("%f %c %f = %f", number1, remainderSign, number2,
number1 % number2); //return remainder
                break;
            case "divide":
                if(number2 == 0){
                    System.out.print("Cannot divide by zero"); //account for 
division by zero
                } else{
                    System.out.printf("%f / %f = %f", number1, number2, number1 / 
number2); // return division
                }
                break;
            default: System.out.printf("%s is not a supported operation.", 
operation);  /* if user puts in invalid operation*/
        }
        scanner.close(); // close the scanner
    } // END: MAIN
}