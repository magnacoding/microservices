/**
 * 
 */
package com.richiez.sample.postgresql.connection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author irichiez
 *
 */
public class CustomerQuerries {

	private final static Logger LOGGER = LogManager.getLogger(CustomerQuerries.class);
	private String filename = null;

	/**
	 * 
	 * @param filename
	 */
	public CustomerQuerries(String filename) {
		this.filename = filename;
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private Properties propertiesFile() throws IOException, NullPointerException {
		CustomerProperties props = new CustomerProperties();
		try {
			return props.getProperties(filename);
		} catch (NullPointerException | IOException e) {
			throw e;
		}
	}

	/**
	 * 
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public String getQuery(String query) throws NullPointerException, IOException {
		Properties props;
		try {
			props = propertiesFile();
			return props.getProperty(query);
		} catch (NullPointerException | IOException e) {
			LOGGER.error("An error occurred retrieving properties file...Please check file: " + filename + "\t"
					+ e.getMessage());
			throw e;
		}
	}

}
