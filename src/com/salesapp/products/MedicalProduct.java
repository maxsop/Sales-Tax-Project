/**
 * 
 */
package com.salesapp.products;

/**
 * MedicalProduct is an item belonging to the category 'Medical' in the shopping store.
 *
 * @author archugs
 */
public class MedicalProduct extends Product {


	/**
	 * Default constructor to initialize a new medical product.
	 */
	public MedicalProduct()
	{
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the <code>MedicalProduct</code> attributes.
	 *
	 * @param name - the name of the medical product
	 * @param price - the price of the medical product
	 * @param imported - boolean value of whether the medical product imported or not
	 * @param quantity - quantity of medical product items
	 */	
	public MedicalProduct(String name, double price, boolean imported, int quantity) 
	{
		super(name, price, imported, quantity);
		
	}

}
