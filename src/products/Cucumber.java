package products;

public class Cucumber extends Product {
	private Category productCategory = Category.VEGETABLE;
	private Double productPrice = 20.00;

	public Cucumber() {
		super();
	}
	
	/**
	 * Function to buy a product
	 */
	public Double buyProduct() {
		this.incrementProductQuantity();
		this.setProductTotalPrice(this.getProductQuantity() * this.productPrice);
		System.out.println("Bought " + this.getProductQuantity() + " Cumbers, total price: " + this.getProductTotalPrice());
		return this.productPrice;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
}
