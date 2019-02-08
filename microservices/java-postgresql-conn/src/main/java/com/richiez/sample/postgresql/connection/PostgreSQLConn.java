package com.richiez.sample.postgresql.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author irichiez
 *
 */
public class PostgreSQLConn {
	
	private final static Logger LOGGER = LogManager.getLogger(PostgreSQLConn.class);

	/**
	 * 
	 * @return connection
	 */
	public Connection getDatabaseConnection() {
		Properties props = new Properties();
		Connection connection = null;
		try {
			props = new CustomerProperties().getProperties("postgresconn.properties");
			connection = DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("pwd"));
			LOGGER.info("Connection to PostgreSQL database successful!");
		} catch (IOException | SQLException | NullPointerException e) {
			LOGGER.error("An error occurred creating PostgreSQL database connection... Please check connection properties "+ e.getMessage());
		}
		return connection;
	}

}
