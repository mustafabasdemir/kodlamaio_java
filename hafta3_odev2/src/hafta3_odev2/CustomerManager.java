package hafta3_odev2;
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger loger)
	{
		this.logger=loger;
	}

	public void add()
	{
		System.out.println("müşteri eklendi.");
		logger.log(" mesaj loglandı. ");
	}
}
