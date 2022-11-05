package hafta3_Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WomenCalculator womenCalculator = new WomenCalculator();
		womenCalculator.hesapla();
		womenCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomenCalculator();
		womenCalculator.hesapla();
		
	}

}
