import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	MyCalc simpleCalc = new MyCalc();	
	Scanner keyboard = new Scanner(System.in);
	double num= 0,x= 0,y = 0;
	char operator = 0;
	boolean end = false;
	String error = "";
	//Editable introductory messages
	System.out.println("Welcome to Mark's Bitchin' Calculator!");
	System.out.println("The mathematical operational will be completed in Reverse Polish Notation.");
	System.out.println("The system will prompt you for each number and operator (only +,-,*, and / are available. Please don't try to break me.");
	
	
	// try block to obtain inputs and catch errors
	try {
		System.out.println();
		System.out.println("Input first number:");
		x= keyboard.nextDouble();
		System.out.println("Input second number:");
		y= keyboard.nextDouble();
		System.out.println("Input operator (+,-,*,/):");
		operator = (char)keyboard.next().charAt(0);
	} catch (InputMismatchException e) {
		error = "Input Mismatch Exception";
	}
	
	//switch case to determine what mathematical operation to do
	switch (operator) {
    case '+':  num = simpleCalc.add(x,y);
             break;
    case '-':  num = simpleCalc.subtract(x, y);
             break;
    case '*':  num = simpleCalc.mult(x, y);
             break;
    case '/':  num = simpleCalc.divide(x, y);
             break;
    default: error = "Invalid operator";
             break;
	}
	
	//outputting final answer, whether it be an error message or the # value
	if (error.isEmpty()) {
		System.out.println("Ans: " + num);
	}
	else {
		System.out.println(error);
	}
	
	keyboard.close();
	}	
}
