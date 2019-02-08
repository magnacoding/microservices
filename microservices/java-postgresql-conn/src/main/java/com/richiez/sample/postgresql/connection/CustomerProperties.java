/**
 * 
 */
package com.richiez.sample.postgresql.connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author irichiez
 *
 */
public class CustomerProperties {

	/**
	 * 
	 * @return Properties
	 */
	public Properties getProperties(String file_name) throws IOException, NullPointerException {
		Properties props = new Properties();
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			InputStream fis = loader.getResourceAsStream(file_name);
			props.load(fis);
		} catch (IOException | NullPointerException e) {
			throw e; 
		}
		return props;
	}

}
