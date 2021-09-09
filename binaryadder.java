/*
 * Property of Mitchell Jonker
 */
import java.util.Scanner;
public class binaryadder {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //Java kept yelling at me for a resource leak.. so I added this suppression.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nProvide two 4-bit binary values, in two separate inputs.\nThey will be added and converted into decimal!\n");

		int entry1, entry2 = 0; //Define the needed strings for the calculation.
		int a, b = 0; //Define all of the needed integers for the calculation.
		
		for(entry1 = keyboard.nextInt(); entry1 >= 0; entry1 = keyboard.nextInt()) {
			System.out.print(" +\n"); //The for statement begins by prompting the user to enter a value, which gets stored as entry1 (this is condition1). Every time the for statement is run (each cycle), the for statement will run condition3, which too prompts the user to enter a value (to be stored as entry1). The values of previous cycles can be disregarded, so they are simply overwritten with each cycle.
			
			entry2 = keyboard.nextInt();
		
			a = calculator(entry1); //Define binary integer A
			b = calculator(entry2); //Define binary integer B
		
			System.out.println(" ="); //This is the beginning of a line of System output. Since the math would be incorrect when text was between the integers, the following are .print(). and not .println().
			System.out.print(a + " + ");
			System.out.print(b + " in decimal\n =\n");
			System.out.print(a +b + " in decimal\n\nEnter two binary values again to continue calculating.\n\n"); //This is the output of the value, which is calculated by adding all of the integers a1-4, and b1-4 together.
		}
	}

	private static int calculator(int number) { //This function converts the provided integer to binary
		String numString = Integer.toString(number);
		int result = Integer.parseInt(numString,2);
		return result;
	}
}