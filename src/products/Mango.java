package products;

public class Mango extends Product{
	private Category productCategory = Category.FRUIT;
	private Double productPrice = 10.00;
	
	public Mango() {
		super();
	}
	
	/**
	 * Function to buy a product
	 */
	public Double buyProduct() {
		this.incrementProductQuantity();
		this.setProductTotalPrice(this.getProductQuantity() * this.productPrice);
		System.out.println("Bought " + this.getProductQuantity() + " Mangoes, total price: " + 
		this.getProductTotalPrice());
		return this.productPrice;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
}
