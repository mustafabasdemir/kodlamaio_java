package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.product;
//implement : interface yi implement ettik productDao kurallarına uyacak 
public class JdbcProductDao implements ProductDao{

	public void add(product product)
	{   // sadece db erişim kodları buaray yazılır bunun için sql bilmek gerekir. 
		System.out.println("JDBC ile veritabanına eklendi ");
	}
}
