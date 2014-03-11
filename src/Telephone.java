import java.util.Scanner;

/**
 * A telephone that takes simulated keystrokes and
 * voice input form the user and simulates spoken text.
 * @author Akeel
 *
 */
public class Telephone {

	public Telephone(Scanner aScanner) {
		scanner = aScanner;
	}
	
	public void speak(String output) {
		System.out.println(output);
	}
	
	public void run(Connection c) {
		boolean more = true;
		
		while(more) {
			/* TODO */
		}
	}
	
	private Scanner scanner;
}
