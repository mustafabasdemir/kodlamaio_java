
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ICustomerDal ıcuCustomerDal = new MySqlCustomerDal();
		ıcuCustomerDal.add();
		
		
		/*
		// yontem 1 uygulanıs 
		CustomerManager customerManager = new CustomerManager();
		customerManager.ıcCustomerDal= new SqlServerCustomerDal();
		customerManager.add();
		*/
		
		
		// yontem 2 uygulanıs 
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
	}

}
