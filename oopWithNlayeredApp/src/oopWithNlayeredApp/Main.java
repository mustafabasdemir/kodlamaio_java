package oopWithNlayeredApp;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.logging.DatabaseLogger;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.core.logging.MailLogger;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.entities.product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		product product1 = new product(1,"Iphone Xr",1000);
		
		Logger[] loggers= {new DatabaseLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);

	}

}
