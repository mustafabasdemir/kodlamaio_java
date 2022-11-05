package hafta3_odev2;

public class Main {

	public static void main(String[] args) {
		/*
		// sınıfı dizi haline getirip bütün loglama işlemlerini çağırdık
		BaseLogger[] loggers = new BaseLogger[] {new ConsoleLogger(),new DatabaseLogger(),new MailLogger()};
		
		// for dengusu ile diziyi cagırdık 
		for(BaseLogger logger:loggers)
		{
			logger.log(" : loglama tamamlandı");  
		}
		*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		//mail ile loglanmasını istediğimizi customer managere bildirdik
		customerManager.add();
		
		
	}

}
