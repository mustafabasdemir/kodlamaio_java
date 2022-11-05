package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.product;

public class HipernateProductDao implements ProductDao {
	
	public void add(product product)
	{   // sadece db erişim kodları buaray yazılır bunun için sql bilmek gerekir. 
		System.out.println("Hipernate ile veritabanına eklendi ");
	}
}
