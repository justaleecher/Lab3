/*  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  ADT assignment
 */

public class Main {

	// Main
	public static void main(String[] args) {
		//Array of Currency objects
		Currency[] currencyObjects = new Currency[20];
		currencyObjects[0] = new Dollar(57.12);
		currencyObjects[1] = new Dollar(23.44);
		currencyObjects[2] = new Dollar(87.43);
		currencyObjects[3] = new Dollar(68.99);
		currencyObjects[4] = new Dollar(111.22);
		currencyObjects[5] = new Dollar(44.55);
		currencyObjects[6] = new Dollar(77.77);
		currencyObjects[7] = new Dollar(18.36);
		currencyObjects[8] = new Dollar(543.21);
		currencyObjects[9] = new Dollar(20.21);
		currencyObjects[10] = new Dollar(345.67);
		currencyObjects[11] = new Dollar(36.18);
		currencyObjects[12] = new Dollar(48.48);
		currencyObjects[13] = new Dollar(101.00);
		currencyObjects[14] = new Dollar(11.00);
		currencyObjects[15] = new Dollar(21.00);
		currencyObjects[16] = new Dollar(51.00);
		currencyObjects[17] = new Dollar(1.00);
		currencyObjects[18] = new Dollar(251.00);
		currencyObjects[19] = new Dollar(151.00);
		//Create Stack, Queue, List
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		//Operations with ADTs
		stack.push(currencyObjects[0]);
		stack.push(currencyObjects[3]);
		stack.push(currencyObjects[4]);
		stack.push(currencyObjects[5]);
		stack.pop();
		stack.pop();
		stack.peek().print();
	}

}

