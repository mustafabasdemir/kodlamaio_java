
public class CustomerManager {

	/*
	ICustomerDal ─▒cCustomerDal;  // yontem1 
	public void add()
	{
		─▒cCustomerDal.add();
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
