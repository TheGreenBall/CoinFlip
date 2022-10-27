import javax.swing.*;

public class CoinFlip {

	public static void main(String args[]) {	
		String user,coin,winner;
		
		greeting();
		
		do
		{		
			user=IO.getString("Would you like: (H)- Heads or (T)- Tails");
			coin=flip();
			winner=compare(user,coin);
			output(user,coin,winner);
		}while( repeat() );
	}

	// DONE
	//void
	// greeting -This method should greet the user by telling them what the program is going to do
	public static void greeting() {

		JOptionPane.showInputDialog("Welcome to Coin Flip! It's an app that flips a coin, that's all it does, I only print this line, and now my life's purpose is served, I don't  want to di... ");


	}



	//flip -This method uses Math.random() to generate a random number and then returns either heads or tails.
	// Returns only "H" or "T"

	public static String flip() {

		double a = Math.random();

		if ( a >= 5) {

			return "H";

		} else {
			return "T";
		}

	}

	// Pre-Sent only "H" or "T"
	//Returns only "W" or "L" ;
	//compare -This method is sent the users value and the computer's value and
	// will send back W if the user wins or L if the user loses.

	public static String compare(String a, String b) {

		if (a == "H"){
			if (b == "h") {
				return "Win";
			} else {
				return  "Lose";
			}
		}
		if (a == "T"){
			if (b == "T") {
				return "Win";
			} else {
				return  "Lose";
			}
		}
		return  "Lose";
	}


	// @Pre-Sent only  "H" or "T", "W" or  "L" ;
	//@Post-None
	//output -This method will receive what the user guessed and what the computer generated.
	// It will also receive whether the user wins or loses and print out all results.

	public static void output(String a, String b, String c) {

		System.out.println(" You wanted: " + a + " Coin FLip: " + b + " You " + c);


	}

	//@Pre-None
	//@Post-Returns only true or false;
	//repeat -This method will ask the user if they want to repeat the program.
	// If they type 'yes' the method returns true. If they do not type yes, the method returns false.

	public static boolean repeat() {

		return IO.getBoolean("Play again? true = yes");


	}

}
