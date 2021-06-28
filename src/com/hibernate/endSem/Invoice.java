package com.hibernate.endSem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerInvoice")
public class Invoice {
	@Id
	private Double invoiceId;
	private String customerName;
	private Double totalAmount = 0.00;

	public Invoice(String customerName) {
		this.customerName = customerName;
		this.invoiceId = Math.random();
	}
	
	/**
	 * Function to add amount to final total
	 * @return tatalAmount
	 */
	public Double addToTotal(Double amount) {
		this.totalAmount += amount;
		return this.totalAmount;
	}

	public Double getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Double invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
