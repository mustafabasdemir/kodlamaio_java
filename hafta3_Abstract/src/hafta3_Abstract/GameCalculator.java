package hafta3_Abstract;

public abstract class GameCalculator {
	
	public abstract void hesapla();  // exteds eden her sınıfın hesapla  fonksiyonu olmak zorundadır
	
	public final void gameOver()  // değiştirilmeyen oldugu gibi kullanılan yapıda class
	{
		System.out.println("Oyun bitti...");
	}

}
