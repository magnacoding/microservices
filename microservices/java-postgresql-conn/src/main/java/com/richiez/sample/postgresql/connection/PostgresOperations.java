/**
 * 
 */
package com.richiez.sample.postgresql.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.richiez.sample.postgresql.domain.Customer;

/**
 * @author irichiez
 *
 */
public class PostgresOperations {

	private final static Logger LOGGER = LogManager.getLogger(PostgresOperations.class);

	public static void main(String[] args) {
		PostgreSQLConn postgresconn = new PostgreSQLConn();
		Connection connection = postgresconn.getDatabaseConnection();
		CustomerQuerries custQuerries = new CustomerQuerries("cusqueries.properties");
		if (connection != null) {
			/* Do Some CRUD operations */
			// Customer customer = new Customer(10, "John", "Doe", 144000000);
			// createCustomer(connection, custQuerries, customer);
			getCustomerByName(connection, custQuerries, "Andrew");
		}
		try {
			if(connection != null) {
			connection.close();
			}
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
	}

	/**
	 * 
	 * @param connection
	 * @param customer
	 */
	public static void createCustomer(Connection connection, CustomerQuerries cq, Customer customer) {		
		try {
			String query = cq.getQuery("insert_customer");
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, customer.getId());
			pst.setString(2, customer.getFirst_name());
			pst.setString(3, customer.getLast_name());
			pst.setInt(4, customer.getAcc_amount());
			pst.executeUpdate();
		} catch (SQLException | NullPointerException | IOException e) {
			LOGGER.error(e.getMessage());
		}
		LOGGER.info("Customer " + customer.getFirst_name() + " added successfully!");
	}

	public static void getCustomerByName(Connection connection, CustomerQuerries cq, String first_name) {
		try {
			String query = cq.getQuery("find_customer");
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, first_name);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("acc_amount"));
				LOGGER.info(customer.toString());
			}
		} catch (SQLException | NullPointerException | IOException e) {
			LOGGER.error(e.getMessage());
		}
	}
}
