
public class CoinFlipRunner {

	public static void main(String[] args) {

		CoinFlip.greeting();

		//Below should print H or T only. Run multiple times
		System.out.println(CoinFlip.flip());

		//Should print only W or L  **Change values
		System.out.println(CoinFlip.compare("H","T"));

		//Should print results. Make sure to use all arguments
		// **Change values to make sure it works
		CoinFlip.output("H","T","L");

		//Should print true or false
		System.out.println(CoinFlip.repeat());


		//If you want to test the entire project
		CoinFlip.main(new String[0]);
	}
}
