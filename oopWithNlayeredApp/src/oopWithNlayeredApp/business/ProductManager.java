package oopWithNlayeredApp.business;

import java.util.List;

import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.entities.product;


public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;


	public ProductManager(ProductDao productDao ,  Logger[] loggers) {
		this.productDao = productDao;
		this.loggers =loggers;
	}

	public void add(product product) throws Exception
	{
		if(product.getUnitPrice()<10)
		{
			throw new Exception("ürün fiyatı 10'dan küçük olamaz.");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
