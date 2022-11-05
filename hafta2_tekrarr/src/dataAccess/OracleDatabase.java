package dataAccess;

public class OracleDatabase implements dataInterface {
	@Override
    public void login(){
        System.out.println("-> Oracle Veritabanına Bağlanıldı.");
    }
    @Override
    public void add() {
        System.out.println("-> Verilen İşlemler Oracle Veritabanına Kaydedildi.");
    }
    @Override
    public void delete() {
        System.out.println("-> Verilen İşlemler Oracle Veritabanından Silindi.");
    }
    @Override
    public void fetch() {
        System.out.println("-> İstenilen İşlemler Oracle Veritabanından Getirildi.");
    }
    @Override
    public void update() {
        System.out.println("-> İstenilen İşlemler Oracle Veritabanı Üzerinde Güncellendi.");
    }
}
