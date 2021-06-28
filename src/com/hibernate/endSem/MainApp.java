package com.hibernate.endSem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import products.Cucumber;
import products.Mango;

public class MainApp {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Mango mango = new Mango();
		Cucumber cucumber = new Cucumber();
		
		System.out.print("Enter Customer Name: ");
		String customerName = scan.nextLine();
		
		Invoice invoice = new Invoice(customerName);
		
		// Buy a Mango
		invoice.addToTotal(mango.buyProduct());
		// Buy a Cucumber
		invoice.addToTotal(cucumber.buyProduct());
		// Buy a Mango
		invoice.addToTotal(mango.buyProduct());
		// Buy a Cucumber
		invoice.addToTotal(cucumber.buyProduct());
		
		System.out.println("Customer Name: " + invoice.getCustomerName());
		System.out.println("Total purchase: " + invoice.getTotalAmount());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(invoice);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
