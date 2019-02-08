/**
 * 
 */
package com.richiez.sample.postgresql.domain;

/**
 * @author irichiez
 *
 */
public class Customer {
	
	private int id;
	private String first_name;
	private String last_name;
	private int acc_amount;
	
	public Customer(int id, String first_name, String last_name, int acc_amount) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.acc_amount = acc_amount;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the acc_amount
	 */
	public int getAcc_amount() {
		return acc_amount;
	}
	/**
	 * @param acc_amount the acc_amount to set
	 */
	public void setAcc_amount(int acc_amount) {
		this.acc_amount = acc_amount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", acc_amount="
				+ acc_amount + "]";
	}

}
