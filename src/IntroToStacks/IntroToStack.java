package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Random rand = new Random();
		Stack<Double> stack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			stack.push(rand.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String s = JOptionPane.showInputDialog("enter 1 number between 0 and 100");
		String s2 = JOptionPane.showInputDialog("do it again");
		double inty = Double.parseDouble(s);
		double inty2 = Double.parseDouble(s2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		for (int i = 0; i < 100; i++) {

			double x = stack.pop();
			if(inty > x && x > inty2) {
				System.out.println(x);
			
					
			}
				
			}
		}
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}

