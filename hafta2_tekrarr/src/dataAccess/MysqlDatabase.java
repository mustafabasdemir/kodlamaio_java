package dataAccess;

public class MysqlDatabase implements dataInterface {

	@Override
	public void login() {
		System.out.println("Mysql Database giriş yapıldı.");
		
	}

	@Override
	public void add() {
		System.out.println("Mysql Database veri eklendi .");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql Database veri silindi.");
		
	}

	@Override
	public void fetch() {
		System.out.println("Mysql Database veriler getirildi.");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql Database güncelleme  yapıldı.");
		
	}

}
