package abstrackDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomManager customManager = new CustomManager();
		customManager.database = new MySqlServerDatabase(); 
		// custom manager içinde basedatabase classına database dedik
		// main içinde custom manager database'in mysql oldugunu soyledik
		// bu durumda custom manager classı basemanagerdan mysql içindeki getData fonksiyonunu cağırdı  
		customManager.getCustomers();

	}

}
