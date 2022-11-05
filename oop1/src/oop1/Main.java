package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(); // product nesnesini tanıttık
		product1.setName("delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("smeg kahve makinesi");
		product2.setDiscount(4);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen and  kahve makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(8500);
		product3.setUnitsInStock(6);
		product3.setImageUrl("image3.jpg");

		// verileri diziye aktardık
		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName("mustafa");
		individualCustomer.setLastName("başdemir");

		CorporatCustomer corporatCustomer = new CorporatCustomer();
		corporatCustomer.setId(2);
		corporatCustomer.setCompanyName("kodlama.io");
		corporatCustomer.setPhone("04444444444");
		corporatCustomer.setTaxNumber("111111111");
		corporatCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporatCustomer}; 
		//nesne verilerini customer adında bir diziye  attık  
		
		
		

	}

}
