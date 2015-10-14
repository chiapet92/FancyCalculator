import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {
	double ans= 0,firstNum = 0,secondNum = 0;
	char operator = 0;
	Scanner keyboard = new Scanner(System.in);
	public double getNum(int x) {
		if (x ==1 ) {
			return firstNum;
		}
		else {
			return secondNum;
		}
	}
	public double add(double x, double y) {
		ans = x+y;
		return ans;
	}
	public double subtract(double x, double y) {
		ans = x-y;

		return ans;
	}
	public double mult(double x, double y) {
		ans = x*y;
		return ans;
	}
	public double divide(double x, double y) {
		ans = x/y;
		return ans;
	}
	public boolean getInput(int x) {
		// try block to obtain inputs and catch errors
		try {
			System.out.println();
			switch (x) {
			case 1:	System.out.print("Input first number: ");
			//keyboard.reset();
			firstNum= keyboard.nextDouble();
			break;
			case 2: System.out.print("Input second number: ");
			//keyboard.reset();
			secondNum = keyboard.nextDouble();
			break;
			case 3: System.out.print("Input operator (+,-,*,/): ");
			operator = (char)keyboard.next().charAt(0);
			if ((operator != '+')&operator !='-'&operator !='*'&operator !='/') {
				//System.out.println();
				System.out.println("Invalid Operator");
				return false;
			}
			break;
			}
			return true;
		} catch (InputMismatchException e) {
			//System.out.println();
			System.out.println("Input Mismatch Exception");
			keyboard = new Scanner(System.in);
			return false;
		}
	}
	public void performCalculation() {
		switch (operator) {
	    case '+': add(firstNum,secondNum);
	             break;
	    case '-': subtract(firstNum, secondNum);
	             break;
	    case '*': mult(firstNum, secondNum);
	             break;
	    case '/': divide(firstNum, secondNum);
	             break;
		}
	}
	public void printAns() {
		System.out.println();
		System.out.println("Ans: " + ans);
	}
	public void closeKeyboard() {
		keyboard.close();
	}
}