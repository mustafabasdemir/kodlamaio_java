package dataAccess;

public class DatabaseManager {
	private dataInterface database;
    public DatabaseManager(dataInterface database){
        this.database = database;
    }
    public void loginDatabase(){
        database.login();
    }
    public void addDatabase(){
        database.add();
    }
    public void deleteDatabase(){
        database.delete();
    }
    public void getDatabase(){
        database.fetch();
    }
    public void updateDatabase(){
        database.update();
    }
}
