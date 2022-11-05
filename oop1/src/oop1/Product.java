package oop1;

// class sınıflandırma : PascalCase
public class Product {
	private String name; // ürünün adı
	// veri tipi isimlendirmeleri camelCase yazılır
	private double unitPrice; // birim fiyat
	private double discount; // indirim oranı
	private String imageUrl; // ürünün resmi , cok resimli ürün için aray yapılabilir
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
