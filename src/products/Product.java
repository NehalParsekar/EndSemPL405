package products;

public abstract class Product {
	private String productName;
	private Integer productQuantity = 0;
	private Double productTotalPrice = 0.00;

	protected Product() {
	}
	
	public abstract Double buyProduct();
	
	public Integer incrementProductQuantity() {
		this.productQuantity++;
		return this.productQuantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Double getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(Double productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}
}
