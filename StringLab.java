import java.util.Scanner;

public class StringLab {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first string:");
		
		String firstString = input.nextLine();
		
		System.out.println("Here is your string capitalized: " + 
		StringMethods.capitalize(firstString));
		
		System.out.println("Where in your string can you find 'Waldo'? " + 
		StringMethods.wheresWaldo(firstString));
		
		System.out.println("Here is your string in reverse: " + 
		StringMethods.reverse(firstString));
		
		System.out.println("Here is the aftermath of your string: " +
		StringMethods.afterMath(firstString));
		
		System.out.println("Here is your string spelled vertically: " );
		StringMethods.letterize(firstString);
		
		//StringMethods.camelCase(firstString);
		
		System.out.println("Enter your second string:");
		
		String secondString = input.nextLine();
		
		System.out.println("Here are your strings alphabetized: " +
		StringMethods.firstThingsFirst(firstString, secondString));
		
		System.out.println("This is the longer of your two strings: ");
		StringMethods.soLong(firstString, secondString);
		
		input.close();
	}
}
