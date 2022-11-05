
public class CustomerManager {

	/*
	ICustomerDal ıcCustomerDal;  // yontem1 
	public void add()
	{
		ıcCustomerDal.add();
	}
	*/
	
	//yontem 2 
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal =customerDal;
	}
	
	public void add()
	{
		customerDal.add();
	}
}
