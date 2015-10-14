public class Calculator {

	public static void main(String[] args) {
	MyCalc simpleCalc = new MyCalc();	
	boolean dummyVal = false;
	//Editable introductory messages
	System.out.println("Welcome to Mark's Bitchin' Calculator!");
	System.out.println("The mathematical operation will be completed in Reverse Polish Notation.");
	System.out.println("The system will prompt you for each number and operator (only +,-,*, and / are available). Please don't try to break me.");
	
	// will prompt for all inputs individually
	do {
		dummyVal = simpleCalc.getInput(1); //firstNum
	} while (dummyVal==false);
	
	do {
		dummyVal = simpleCalc.getInput(2); //secondNum
	} while (dummyVal==false);	
	
	do {
		dummyVal = simpleCalc.getInput(3); //Operator
	} while (dummyVal==false);
	
	//perform calculation
	simpleCalc.performCalculation();
	simpleCalc.printAns();
	simpleCalc.closeKeyboard();
	}
}