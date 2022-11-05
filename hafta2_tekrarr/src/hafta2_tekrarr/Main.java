package hafta2_tekrarr;

import Logger.logSettings;
import dataAccess.DatabaseManager;
import dataAccess.MysqlDatabase;
import dataAccess.OracleDatabase;

public class Main {

	public static void main(String[] args) {
		System.out.println("merhaba");
		
	
		DatabaseManager databaseManager = new DatabaseManager(new OracleDatabase());
		databaseManager.loginDatabase();
		
		logSettings logSet = new logSettings();
		String isim ="mustafa";
		logSet.log(isim);

	}

}
